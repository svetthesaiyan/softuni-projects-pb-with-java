package advanced_conditional_statements_lab;

import java.util.Scanner;

public class b_workday_or_weekend 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a day of the week: ");
		String dayOfWeek=scanner.nextLine();
		switch(dayOfWeek)
		{
			case "Monday": 
			case "Tuesday": 
			case "Wednesday": 
			case "Thursday": 
			case "Friday": 
				System.out.println("That's a workday.");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("Hooray, the weekend is finally upon us!");
				break;
			
			default: 
				System.out.println("You're actually brain-dead, aren't you?");
		}
	}
}
