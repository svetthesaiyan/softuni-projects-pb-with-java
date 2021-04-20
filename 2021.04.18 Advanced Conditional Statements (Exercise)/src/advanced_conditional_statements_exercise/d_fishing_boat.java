package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class d_fishing_boat 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		int budget=Integer.parseInt(scanner.nextLine());
		System.out.println("During which season will you be going fishing?");
		System.out.println("You can pick from: \"Spring\", \"Summer\", \"Autumn\" and \"Winter\".");
		String season=scanner.nextLine();
		System.out.print("Enter the amount of fishermen in your group: : ");
		int fishermenCount=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double boatRentPrice=0;
		
		switch(season)
		{
			case "Spring":
				boatRentPrice=3000;
				break;
				
			case "Summer":
			case "Autumn":
				boatRentPrice=4200;
				break;
				
			case "Winter":
				boatRentPrice=2600;
				break;
		}
		
		// отстъпки, зависейки от броя рибари
		if(fishermenCount<=6)
			boatRentPrice*=0.9;
		else if(fishermenCount>=7 && fishermenCount<=11)
			boatRentPrice*=0.85;
		else if(fishermenCount>=12)
			boatRentPrice*=0.75;
		
		// отстъпка, ако броят рибари е четен и не ловуват през есента
		if(fishermenCount%2==0 && !season.equals("Autumn"))
			boatRentPrice*=0.95;
		
		// извеждане на крайната сума
		if(budget>=boatRentPrice)
			System.out.printf("Happy fishing! You have %.2f leva left after paying the boat rent price.", (budget-boatRentPrice));
		
		else if(budget<boatRentPrice)
			System.out.printf("You don't have enough money for us to lend you a boat! You need %.2f more leva.", (boatRentPrice-budget));
	}
}
