package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class a_cinema 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of film you're going to watch.");
		System.out.println("You can pick from: \"Premiere\", \"Normal\" or \"Discount\".");
		String filmType=scanner.nextLine();
		System.out.print("Enter the amount of rows you'll be occupying in the theatre: ");
		int rows=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of columns you'll be occupying in the theatre: ");
		int columns=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double premierePrice=12;
		double normalPrice=7.5;
		double kidsPrice=5;
		
		double price=0;
		
		if(filmType.equalsIgnoreCase("Premiere"))
			price=rows*columns*premierePrice;
		else if(filmType.equalsIgnoreCase("Normal"))
			price=rows*columns*normalPrice;
		else if(filmType.equalsIgnoreCase("Discount"))
			price=rows*columns*kidsPrice;
		
		System.out.printf("You'll need to pay %.2f lv. for all of those seats, sir.", price);
	}
}
