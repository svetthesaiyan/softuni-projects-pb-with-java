package advanced_conditional_statements_lab;

import java.util.Scanner;

public class g_work_hours 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an hour of the day and we'll tell you whether we're open at said time: ");
		int hours=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the day of the week when you'd like to visit us: ");
		String day=scanner.nextLine();
		System.out.println();
		
		if(hours>=10 && hours<=18)
		{
			switch(day)
			{
				case "Monday":
				case "Tuesday":
				case "Wednesday":
				case "Thursday":
				case "Friday":
				case "Saturday":
					System.out.println("Yes, we are indeed open. Welcome!");
					break;
				default:
					System.out.println("I'm afraid we're closed at this time. We don't work on Sundays.");
			}
		}
		else
			System.out.println("closed");
	}
}
