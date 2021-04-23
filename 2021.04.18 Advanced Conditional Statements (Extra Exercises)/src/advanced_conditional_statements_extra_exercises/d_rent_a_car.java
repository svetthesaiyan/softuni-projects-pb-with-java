package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class d_rent_a_car 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		double budget=Double.parseDouble(scanner.nextLine());
		System.out.print("Choose whether the season in which you'll be renting a car is either \"Spring\", \"Summer\", \"Autumn\" or \"Winter\": ");
		String season=scanner.nextLine();
		System.out.println();
		
		String carClass="";
		String carType="";
		double carPrice=0;
		
		if(budget<=100)
		{
			carClass="Economy class";
			
			if(season.equals("Summer"))
			{
				carType="Cabrio";
				carPrice=budget*0.35;
			}
			else if(season.equals("Winter"))
			{
				carType="Jeep";
				carPrice=budget*0.65;
			}
		}
		
		else if(budget>100 && budget<=500) 
		{
			carClass="Compact class";
			
			if(season.equals("Summer"))
			{
				carType="Cabrio";
				carPrice=budget*0.45;
			}
			else if(season.equals("Winter"))
			{
				carType="Jeep";
				carPrice=budget*0.8;
			}
		}
		
		else if(budget>500)
		{
			carClass="Luxury class";
			carType="Jeep";
			carPrice=budget*0.9;
		}
		
		System.out.println(carClass);
		System.out.printf("%s - %.2f", carType, carPrice);
	}
}
