package conditional_statements_lab;

import java.util.Scanner;

public class e_password 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter your password: ");
		String password=scanner.nextLine();
		
		if(password.equals("s3cr3t!P@ssw0rd"))
			System.out.println("Welcome, <user>.");
		else
			System.out.println("Wrong password!"+"\n"+"Please try again.");
	}
}