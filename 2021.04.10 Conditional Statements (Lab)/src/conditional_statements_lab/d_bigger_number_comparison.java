package conditional_statements_lab;

import java.util.Scanner;

public class d_bigger_number_comparison 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a whole number: ");
		int number=Integer.parseInt(scanner.nextLine());
		
		if(number<100)
			System.out.println("The number you entered is less than 100.");
		else if(number>=100&&number<=200)
			System.out.println("The number you entered is between 100 and 200.");
		else
			System.out.println("The number you entered is greater than 200.");
	}
}

