package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class c_celsius_to_fahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double degrees=Double.parseDouble(scanner.nextLine());
		
		double celsius_to_fahrenheit=(degrees*1.8)+32;
		
		System.out.printf("%.2f", celsius_to_fahrenheit);
	}
}
