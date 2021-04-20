package advanced_conditional_statements_lab;

import java.util.Scanner;

public class k_fruit_shop
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the fruit you'd like to buy here: ");
		String fruit=scanner.nextLine();
		System.out.print("Enter what day you're planning to go shopping: ");
		String day=scanner.nextLine();
		System.out.print("Enter how many kilograms you'd like of said fruit: ");
		double quantity=Double.parseDouble(scanner.nextLine());
		System.out.println();
		System.out.print("Here's how much your order costs: ");
		
		double price=0;
		
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"))
		switch(fruit)
		{
		case "banana":
			System.out.printf("%.2f", price=2.5*quantity);
			break;
		case "apple":
			System.out.printf("%.2f", price=1.2*quantity);
			break;
		case "orange":
			System.out.printf("%.2f", price=0.85*quantity);
			break;
		case "grapefruit":
			System.out.printf("%.2f", price=1.45*quantity);
			break;
		case "kiwi":
			System.out.printf("%.2f", price=2.7*quantity);
			break;
		case "pineapple":
			System.out.printf("%.2f", price=5.5*quantity);
			break;
		case "grapes":
			System.out.printf("%.2f", price=3.85*quantity);
			break;
		default: 
			System.out.printf("error");
		}
		
		else if(day.equals("Saturday") || day.equals("Sunday"))
		{
			switch(fruit)
			{
			case "banana":
				System.out.printf("%.2f", price=2.7*quantity);
				break;
			case "apple":
				System.out.printf("%.2f", price=1.25*quantity);
				break;
			case "orange":
				System.out.printf("%.2f", price=0.9*quantity);
				break;
			case "grapefruit":
				System.out.printf("%.2f", price=1.6*quantity);
				break;
			case "kiwi":
				System.out.printf("%.2f", price=3*quantity);
				break;
			case "pineapple":
				System.out.printf("%.2f", price=5.6*quantity);
				break;
			case "grapes":
				System.out.printf("%.2f", price=4.2*quantity);
				break;
			default: 
				System.out.println("error");
			}
		}
		
		else
			System.out.println("error");
	}
}
