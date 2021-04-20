package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class h_on_time_for_exam 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the starting hour of the exam: ");
		int hour=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the starting minute of the exam: ");
		int minutes=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the hour you arrived for the exam: ");
		System.out.println();
		int arrivalHour=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the minute you arrived for the exam: ");
		int arrivalMinutes=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		int totalMinutes=hour*60+minutes;
		int totalArrivalMinutes=arrivalHour*60+arrivalMinutes;
		
		if(totalMinutes==totalArrivalMinutes)
			System.out.println("You're right on time for the exam. Quickly take a seat.");
		
		else if(totalArrivalMinutes<totalMinutes)
		{
			if(totalMinutes-totalArrivalMinutes<=30)
			{
				System.out.println("You're on time for the exam. Take a seat, please.");
				System.out.printf("You arrived %d minutes before the start.", (totalMinutes-totalArrivalMinutes));
			}
			else
			{
				System.out.println("We didn't expect anyone to show up this early. You must be raring to go, eh?");
				
				if(totalMinutes-totalArrivalMinutes<60)
					System.out.printf("You arrived %d minutes before the start.", (totalMinutes-totalArrivalMinutes));
				
				else
				{
					hour=(totalMinutes-totalArrivalMinutes)/60;
					minutes=(totalMinutes-totalArrivalMinutes)%60;
					
					System.out.printf("You arrived %d:%02d hours before the start.", hour, minutes);
				}
			}
		}
		
		else 
		{
			System.out.println("Did you forget we had an exam today? You're late! Quick, sit down over there.");
			
			if(totalArrivalMinutes-totalMinutes<60)
				System.out.printf("You arrived %d minutes after the start.", (totalArrivalMinutes - totalMinutes));
			
			else
			{
				hour=(totalArrivalMinutes - totalMinutes)/60;
				minutes=(totalArrivalMinutes - totalMinutes)%60;
				
				System.out.printf("You arrived %d:%02d hours after the start.", hour, minutes);
			}
		}
	}
}
