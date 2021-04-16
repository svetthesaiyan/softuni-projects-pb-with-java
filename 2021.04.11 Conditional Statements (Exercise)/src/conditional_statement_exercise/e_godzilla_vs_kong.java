package conditional_statement_exercise;

import java.util.Scanner;

public class e_godzilla_vs_kong 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the movie's budget: ");
		double budget=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the amount of actors working on set: ");
		int actor=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the price for clothing per actor: ");
		double actorGarmentPriceperPerson=Double.parseDouble(scanner.nextLine());
		double actorGarmentPriceDiscount=0.0;
		
		double actorGarmentPrice=actorGarmentPriceperPerson*actor;
		double decor=budget*0.1;
		double filmExpenses=0.0;
		
		if(actor>150)	// discount for clothing
		{
			actorGarmentPriceDiscount=actorGarmentPrice-(actorGarmentPrice*0.1);
			filmExpenses=decor+actorGarmentPriceDiscount;
			if(filmExpenses>budget)
			{
				System.out.println("Not enough money!");
				System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget-filmExpenses));
			}
			else if(filmExpenses<=budget)
			{
				System.out.println("Action!");
				System.out.printf("Wingard starts filming with %.2f leva left.", budget-filmExpenses);
			}
		}
		else if(actor<=150)	// no discount for clothing
		{
			filmExpenses=decor+actorGarmentPrice;
			if(filmExpenses>budget)
			{
				System.out.println("Not enough money!");
				System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget-filmExpenses));
			}
			else if(filmExpenses<=budget)
			{
				System.out.println("Action!");
				System.out.printf("Wingard starts filming with %.2f leva left.", budget-filmExpenses);
			}
		}
	}
}
