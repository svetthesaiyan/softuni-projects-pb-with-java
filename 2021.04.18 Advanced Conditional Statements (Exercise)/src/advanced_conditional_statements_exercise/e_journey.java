package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class e_journey 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		double budget=Double.parseDouble(scanner.nextLine());
		System.out.println("During which season will you be going on holiday?");
		System.out.println("You can pick from: \"Summer\" and \"Winter\".");
		String season=scanner.nextLine();
		System.out.println();
		
		String destination="";
		String typeVacation="";
		
		if(budget<=100)
		{
			destination="Bulgaria";
			if(season.equalsIgnoreCase("summer"))
			{
				typeVacation="Camp";
				budget*=0.3;
			}
			else if(season.equalsIgnoreCase("winter"))
			{
				typeVacation="Hotel";
				budget*=0.7;
			}
		}
		
		else if(budget>100 && budget<=1000)
		{
			destination="Balkans";
			if(season.equalsIgnoreCase("summer"))
			{
				typeVacation="Camp";
				budget*=0.4;
			}
			else if(season.equalsIgnoreCase("winter"))
			{
				typeVacation="Hotel";
				budget*=0.8;
			}
		}
		
		else if(budget>1000)
		{
			destination="Europe";
			if(season.equalsIgnoreCase("summer") || season.equalsIgnoreCase("winter"))
			{
				typeVacation="Hotel";
				budget*=0.9;
			}
		}
		
		System.out.printf("Somewhere in (the) %s"+"\n"+"%s - %.2f lv.", destination, typeVacation, budget);
	}
}
