package advanced_conditional_statements_lab;

import java.util.Scanner;

public class e_shop 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What kind of food would you like?"+"\n"+"You can choose from \"coffee\", \"water\", \"beer\", \"sweets\" or \"peanuts\": ");
		String product=scanner.nextLine();
		System.out.print("Where do you live?"+"\n"+"You can choose from \"Sofia\", \"Plovdiv\" and \"Varna\": ");
		String town=scanner.nextLine();
		System.out.print("Enter how much of said product you'd like to purchase: ");
		double quantity=Double.parseDouble(scanner.nextLine());
		
		double pricePerProduct=0.0;
		
		switch(town)
		{
		case "Sofia":
			if(product.equals("coffee"))
				pricePerProduct=0.5;
			else if(product.equals("water"))
				pricePerProduct=0.8;
			else if(product.equals("beer"))
				pricePerProduct=1.2;
			else if(product.equals("sweets"))
				pricePerProduct=1.45;
			else if(product.equals("peanuts"))
				pricePerProduct=1.6;
			break;
			
		case "Plovdiv":
			if(product.equals("coffee"))
				pricePerProduct=0.4;
			else if(product.equals("water"))
				pricePerProduct=0.7;
			else if(product.equals("beer"))
				pricePerProduct=1.15;
			else if(product.equals("sweets"))
				pricePerProduct=1.3;
			else if(product.equals("peanuts"))
				pricePerProduct=1.5;
			break;
			
		case "Varna":
			if(product.equals("coffee"))
				pricePerProduct=0.45;
			else if(product.equals("water"))
				pricePerProduct=0.7;
			else if(product.equals("beer"))
				pricePerProduct=1.1;
			else if(product.equals("sweets"))
				pricePerProduct=1.35;
			else if(product.equals("peanuts"))
				pricePerProduct=1.55;
			break;
		}
		System.out.printf("You owe the cashier %.2f lv. ", (pricePerProduct*quantity));
	}
}
