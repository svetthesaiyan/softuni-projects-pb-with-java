package advanced_conditional_statements_lab;

import java.util.Scanner;

public class m_ski_trip 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days will you be staying at our hotel?");
		int daysStayed=Integer.parseInt(scanner.nextLine()); // тази променлива ползваме да зададем условието на условната конструкция
		int nightsStayed=daysStayed-1;	// тази променлива ползваме в самите условни конструкции
		System.out.println("What kind of room would you like to be accommodated in?"+"\n"+"You can pick from: \"room for one person\", \"apartment\" or \"president apartment\".");
		String roomType=scanner.nextLine();
		System.out.println("Were you satisfied with your experience here? If so, then give us a \"positive\" rating, please."+"\n"+"If not, then select \"negative\" and please explain what we could've done better.");
		String rating=scanner.nextLine();
		System.out.println();
		
		double roomOnePrice=18;
		double roomApartmentPrice=25;
		double roomPresidentApartmentPrice=35;
		
		double price=0;
		
		switch(roomType)
		{
		case "room for one person":
				price=nightsStayed*roomOnePrice;
			break;
			
		case "apartment":
			if(daysStayed<10)
				price=(nightsStayed*roomApartmentPrice)*0.7;
			else if(daysStayed>=10 && daysStayed<=15)
				price=(nightsStayed*roomApartmentPrice)*0.65;
			else if(daysStayed>15) 
				price=(nightsStayed*roomApartmentPrice)*0.5;
			break;
			
		case "president apartment":
			if(daysStayed<10)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.9;
			else if(daysStayed>=10 && daysStayed<=15)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.85;
			else if(daysStayed>15)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.8;
			break;
		}
		
		if(rating.equals("positive"))
		{
			price*=1.25;
			System.out.printf("Your stay with us will cost %.2f lv. We hope to see you again soon!", price);
		}
		
		else if(rating.equals("negative"))
		{
			price*=0.9;
			System.out.printf("Your stay with us will cost %.2f lv. We apologise for any inconveniences on our behalf and promise to do better.", price);
		}
	}
}
