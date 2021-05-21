package pb_exam_2;

import java.util.Scanner;

public class c_oscars_week 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String name=scanner.nextLine();
		String theatreType=scanner.nextLine();
		int ticketsPurchased=Integer.parseInt(scanner.nextLine());
		
		double ticketPrice=0;
		
		switch(name)
		{
			case "A Star Is Born":
				if(theatreType.equals("normal"))
					ticketPrice=ticketsPurchased*7.5;
				else if(theatreType.equals("luxury"))
					ticketPrice=ticketsPurchased*10.5;
				else if(theatreType.equals("ultra luxury"))
					ticketPrice=ticketsPurchased*13.5;
				break;
				
			case "Bohemian Rhapsody":
				if(theatreType.equals("normal"))
					ticketPrice=ticketsPurchased*7.35;
				else if(theatreType.equals("luxury"))
					ticketPrice=ticketsPurchased*9.45;
				else if(theatreType.equals("ultra luxury"))
					ticketPrice=ticketsPurchased*12.75;
				break;
				
			case "Green Book":
				if(theatreType.equals("normal"))
					ticketPrice=ticketsPurchased*8.15;
				else if(theatreType.equals("luxury"))
					ticketPrice=ticketsPurchased*10.25;
				else if(theatreType.equals("ultra luxury"))
					ticketPrice=ticketsPurchased*13.25;
				break;
				
			case "The Favourite":
				if(theatreType.equals("normal"))
					ticketPrice=ticketsPurchased*8.75;
				else if(theatreType.equals("luxury"))
					ticketPrice=ticketsPurchased*11.55;
				else if(theatreType.equals("ultra luxury"))
					ticketPrice=ticketsPurchased*13.95;
				break;
		}
		System.out.printf("%s -> %.2f lv.", name, ticketPrice);
	}
}
