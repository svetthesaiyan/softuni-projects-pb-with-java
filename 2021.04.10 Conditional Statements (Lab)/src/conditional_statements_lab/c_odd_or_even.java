package conditional_statements_lab;

import java.util.Scanner;

public class c_odd_or_even 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int number=Integer.parseInt(scanner.nextLine());
		
		if(number%2==0)
			System.out.println("The number you entered is even.");
		else
			System.out.println("The number you entered is odd.");
	}
}
