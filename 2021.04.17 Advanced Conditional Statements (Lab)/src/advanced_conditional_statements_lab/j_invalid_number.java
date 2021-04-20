package advanced_conditional_statements_lab;

import java.util.Scanner;

public class j_invalid_number 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose a number: ");
		int number=Integer.parseInt(scanner.nextLine());
		boolean isValid=(number>=100 && number<=200) || number==0;
		System.out.println();
		
		if((number>=100 && number<=200) || number==0);	// може целият израз в скобите да се замести с "isValid"
		System.out.println("You input a valid number, whose parameters you'll never truly know...");
		
		if(!isValid)
		System.out.println("you stoopid");
	}
}
