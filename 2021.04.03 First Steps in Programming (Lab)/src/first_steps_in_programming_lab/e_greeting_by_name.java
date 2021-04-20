package first_steps_in_programming_lab;

import java.util.Scanner;

public class e_greeting_by_name 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=scanner.nextLine();
		
		System.out.println("Hello, "+name+ "!");
	}
}
