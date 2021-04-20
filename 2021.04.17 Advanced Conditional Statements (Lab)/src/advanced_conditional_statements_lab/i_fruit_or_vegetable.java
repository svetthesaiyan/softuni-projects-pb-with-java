package advanced_conditional_statements_lab;

import java.util.Scanner;

public class i_fruit_or_vegetable 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Greetings and welcome to Svet's fruit and veg corner shop!"+"\n"+"The fruits we currently have available are bananas, apples, kiwis, cherries, lemons and grapes"+"\n"+"You can also pick from our selection of vegetables: tomatoes, cucumbers, peppers and carrots.");
		System.out.print("Enter the fruit/vegetable you'd like for me to pick for you: ");
		String productName=scanner.nextLine();
		System.out.println();
		
		if(productName.equals("banana") || productName.equals("apple") || productName.equals("kiwi") || productName.equals("cherry") || productName.equals("lemon") || productName.equals("grapes"))
		System.out.println("You've chosen to buy a fruit!");
		
		else if(productName.equals("tomato") || productName.equals("cucumber") || productName.equals("pepper") || productName.equals("carrot"))
			System.out.println("Can't go wrong with some vegetables, eh?");
		
		else
			System.out.println("We don't sell that here unfortunately.");
	}
}
