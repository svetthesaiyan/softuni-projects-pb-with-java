package advanced_conditional_statements_lab;

import java.util.Scanner;

public class f_number_range
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between -100 and 100 excluding 0: ");
		int number=Integer.parseInt(scanner.nextLine());
		
		if(number>=-100 && number!=0 && number<=100)
			System.out.println("Congratulations, you can read as incisively as your average kindergartener!");
		else
			System.out.println("How thick must you be to get this error after such a simple query?");
	}
}
