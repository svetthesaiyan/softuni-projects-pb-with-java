package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class f_number_operations 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num1=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter a second number: ");
		double num2=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter an operator: ");
		String operator=scanner.nextLine();
		
		double sum=0;
		
		if(operator.equals("+") || operator.equals("-") || operator.equals("*"))
		{
			if(operator.equals("+"))
				sum=num1+num2;
			else if(operator.equals("-"))
				sum=num1-num2;
			else if(operator.equals("*"))
				sum=num1*num2;
			
			if(sum%2==0)
				System.out.printf("%.0f %s %.0f = %.0f - even", num1, operator, num2, sum);
			else
				System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operator, num2, sum);
			
		}
		
		else if(operator.equals("/") && num2!=0)
		{
			sum=num1/num2;
			System.out.printf("%.0f %s %.0f = %.2f", num1, operator, num2, sum);
		}
		
		else if(operator.equals("%") && num2!=0)
		{
			sum=num1%num2;
			System.out.printf("%.0f %s %.0f = %.0f", num1, operator, num2, sum);
		}
		
		else if(num2==0)
			System.out.printf("Cannot divide %.0f by zero", num1);
	}
}
