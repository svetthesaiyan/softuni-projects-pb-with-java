package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class j_multiplication_by_two 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number=Double.parseDouble(scanner.nextLine());
	
		while(number>=0)
		{
			System.out.printf("Result: %.2f"+"\n", number*2.0);
			number=Double.parseDouble(scanner.nextLine());
		}
		
		if(number<0)
			System.out.println("Negative number! You have now struck down the loop...");
	}
}
