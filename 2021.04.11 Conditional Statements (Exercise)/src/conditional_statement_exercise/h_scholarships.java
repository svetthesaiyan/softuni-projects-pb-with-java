package conditional_statement_exercise;

import java.util.Scanner;

public class h_scholarships 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your family's monthly income: ");
		double income=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter your average grade: ");
		double averageGrade=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter the minimum wage: ");
		double minimumWage=Double.parseDouble(scanner.nextLine());
		
		double socialScholarship=minimumWage*0.35;
		double meritScholarship=averageGrade*25;
		
		// requirements for social needs scholarship
		if(income<minimumWage && averageGrade>4.5)
		{
			if(socialScholarship>meritScholarship)
			{
				System.out.printf("You get a social scholarship of %.0f BGN", Math.floor(socialScholarship));
			}
			else
			System.out.printf("You get a scholarship for excellent results of %.0f BGN", Math.floor(meritScholarship));
		}
		
		// requirements for merit-based scholarship
		else if(averageGrade>=5.5)
		{
			System.out.printf("You get a scholarship for excellent results of %.0f BGN", Math.floor(meritScholarship));
		}
		
		// scenario when student is ineligible for any scholarship
		else
		{
			System.out.println("You aren't eligible for any kind of scholarship!");
		}
	}
}
