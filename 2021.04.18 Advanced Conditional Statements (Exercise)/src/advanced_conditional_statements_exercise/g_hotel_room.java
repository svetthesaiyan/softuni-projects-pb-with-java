package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class g_hotel_room 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("During which month will you be going on holiday?");
		System.out.println("You can pick from: \"May\", \"June\", \"July\", \"August\", \"September\" or \"October\".");
		String month=scanner.nextLine();
		System.out.print("Enter how many nights you'd like to stay: ");
		int nights=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double studioPrice=0;
		double apartmentPrice=0;
		
		switch(month)
		{
			case "May":
			case "October":
				studioPrice=nights*50;
				apartmentPrice=nights*65;
				
				if(nights>7)
					studioPrice*=0.95;
				
				else if(nights>14)
				{
					studioPrice*=0.7;
					apartmentPrice*=0.9;
				}
			break;
			
			case "June":
			case "September":
				studioPrice=nights*75.2;
				apartmentPrice=nights*68.7;
				
				if(nights>14)
				{
					studioPrice*=0.8;
					apartmentPrice*=0.9;
				}
				break;
				
			case "July":
			case "August":
				studioPrice=nights*76;
				apartmentPrice=nights*77;
				
				if(nights>14)
					apartmentPrice*=0.9;
				break;
		}
		System.out.printf("Studio: %.2f lv."+"\n", studioPrice);
		System.out.printf("Apartment: %.2f lv.", apartmentPrice);
	}
}
