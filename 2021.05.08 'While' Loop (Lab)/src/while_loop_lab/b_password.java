package while_loop_lab;

import java.util.Scanner;

public class b_password 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username=scanner.nextLine();
		System.out.print("Enter your password: ");
		String password=scanner.nextLine();
		System.out.println();
		
		System.out.println("Try to guess what your current password is and I'll let you know if you've got it right!");
		String enteredPassword=scanner.nextLine();
		
		while(!enteredPassword.equals(password))
			enteredPassword=scanner.nextLine();

		System.out.println("Welcome, "+username+"!");
	}
}
