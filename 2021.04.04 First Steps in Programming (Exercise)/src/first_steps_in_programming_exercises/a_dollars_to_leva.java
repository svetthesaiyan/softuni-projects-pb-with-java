package first_steps_in_programming_exercises;

import java.util.Scanner;

public class a_dollars_to_leva 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the amount of dollars you'd like to convert: ");
		double dollars=Double.parseDouble(scanner.nextLine());
		double dollars_to_bgn=dollars*1.79549;
		
		System.out.println();
		System.out.printf("The sum of money you set converted into leva is %.2f", dollars_to_bgn);
	}
}
