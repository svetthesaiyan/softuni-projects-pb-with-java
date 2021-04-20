package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class c_new_house 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter what flowers you'd like to buy.");
		System.out.println("You can pick from: \"Roses\", \"Dahlias\", \"Tulips\", \"Narcissus\" and \"Gladiolus\".");
		String flowerType=scanner.nextLine();
		System.out.print("Enter how many you'd like: ");
		int flowerCount=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your budget: ");
		int budget=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double totalPrice=0;
		
		switch(flowerType)
		{
			case "Roses":
				totalPrice=flowerCount*5;
				if(flowerCount>80)
					totalPrice*=0.9;
				break;
			
			case "Dahlias":
				totalPrice=flowerCount*3.8;
				if(flowerCount>90)
					totalPrice*=0.85;
				break;
			
			case "Tulips":
				totalPrice=flowerCount*2.8;
				if(flowerCount>80)
					totalPrice*=0.85;
				break;
			
			case "Narcissus":
				totalPrice=flowerCount*3;
				if(flowerCount<120)
					totalPrice*=1.15;
				break;
			
			case "Gladiolus":
				totalPrice=flowerCount*2.5;
				if(flowerCount<80)
					totalPrice*=1.2;
				break;
		}
		
		if(budget>=totalPrice)
			System.out.printf("Neli, you have a wonderful garden with %d %s. You'll have %.2f leva left after purchasing all of those flowers.", flowerCount, flowerType, (budget-totalPrice));
		
		else
			System.out.printf("I'm afraid you don't have enough money to buy all of those flowers, Neli; you need %.2f leva more.", (totalPrice-budget));
	}
}
