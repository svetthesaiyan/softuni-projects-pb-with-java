package conditional_statements_lab;

import java.util.Scanner;

public class b_number_comparison 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter second number: ");
		int num2=Integer.parseInt(scanner.nextLine());
		
		if(num1>num2)
			System.out.println(num1+" is bigger than "+num2);
		else if(num1==num2)
			System.out.println(num1+" and "+num2+" are both equal.");
		else
			System.out.println(num1+" is smaller than "+num2);
	}
}

