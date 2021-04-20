package advanced_conditional_statements_lab;

import java.util.Scanner;

public class d_personal_titles 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		double age=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter your gender"+"\n"+"You can pick either \"m\" pr \"f\": ");
		String gender=scanner.nextLine();
		System.out.println();
		
		if(gender.equals("m"))
		{
			if(age<16)
			{
				System.out.println("Your title is: Master");
			}
			else
				System.out.println("Your title is: Mr.");
		}
		
		else if(gender.equals("f"))
			if(age<16)
			{
				System.out.println("Your title is: Miss");
			}
			else
				System.out.println("Your title is: Ms.");
	}
}
