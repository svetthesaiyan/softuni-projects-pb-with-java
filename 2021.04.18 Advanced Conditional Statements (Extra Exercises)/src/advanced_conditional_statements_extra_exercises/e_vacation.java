package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class e_vacation 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		double budget=Double.parseDouble(scanner.nextLine());
		System.out.print("Choose whether the season in which you'll be going on vacation is either \"Summer\" or \"Winter\": ");
		String season=scanner.nextLine();
		System.out.println();
		
		String location="";
		String accommodation="";
		
		if(budget<=1000)
		{
			accommodation="Camp";
			
			if(season.equals("Summer"))
			{
				location="Alaska";
				budget*=0.65;
			}
			else if(season.equals("Winter"))
			{
				location="Morocco";
				budget*=0.45;
			}
		}
		else if(budget>1000 && budget<=3000)
		{
			accommodation="Hut";
			
			if(season.equals("Summer"))
			{
				location="Alaska";
				budget*=0.8;
			}
			else if(season.equals("Winter"))
			{
				location="Morocco";
				budget*=0.6;
			}
		}
		else if(budget>3000)
		{
			accommodation="Hotel";
			
			if(season.equals("Summer"))
				location="Alaska";
			else if(season.equals("Winter"))
				location="Morocco";
			
			budget*=0.9;
		}
		System.out.printf("%s - %s - %.2f", location, accommodation, budget);
	}
}
