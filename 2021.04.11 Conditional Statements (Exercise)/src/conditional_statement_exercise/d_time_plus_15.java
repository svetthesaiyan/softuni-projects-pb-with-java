package conditional_statement_exercise;

import java.util.Scanner;

public class d_time_plus_15 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the current time's hours: ");
		int hour=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the current time's minutes: ");
		int minute=Integer.parseInt(scanner.nextLine());
		
		if (hour>=0 && hour<=23 && minute<45)
			System.out.printf("The time in 15 minutes will be: %d:%d", hour, minute+15);
		else if (hour>=0 && hour<=22 && minute>=45 && minute<=54)
			System.out.printf("The time in 15 minutes will be: %d:0%d", hour+1, minute-45);
		else if (hour>=0 && hour<=22 && minute>=55 && minute<=59)
			System.out.printf("The time in 15 minutes will be: %d:%d", hour+1, minute-45);
		else if (hour==23 && minute>=45 && minute<=54)
			System.out.printf("The time in 15 minutes will be: %d:0%d", hour-23, minute-45);
		else if (hour==23 && minute>=55 && minute<=59)
			System.out.printf("The time in 15 minutes will be: %d:%d", hour-23, minute-45);
	}	
}
