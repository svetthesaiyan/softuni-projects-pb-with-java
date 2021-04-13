package conditional_statements_lab;

import java.util.Scanner;

public class a_grade_check 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your <subject> grade: ");
		double mark=Double.parseDouble(scanner.nextLine());
		
		if(mark>=5.5&&mark<=6)
			System.out.println("Your <subject> grade is excellent!");
		else
			System.out.println("Invalid grade.");
	}
}