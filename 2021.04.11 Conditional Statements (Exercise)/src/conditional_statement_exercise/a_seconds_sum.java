package conditional_statement_exercise;

import java.util.Scanner;

public class a_seconds_sum 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first runner's lap time in seconds: ");
		int firstTime=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the second runner's lap time in seconds: ");
		int secondTime=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the third runner's lap time in seconds: ");
		int thirdTime=Integer.parseInt(scanner.nextLine());
		System.out.println();
		int totalTime=firstTime+secondTime+thirdTime;
		
		int minutes=totalTime/60;
		int seconds=totalTime%60;
		
		if(seconds<10)
			System.out.printf("The team's lap time is: %d:0%d", minutes, seconds);
		else
			System.out.printf("The team's lap time is: %d:%d", minutes, seconds);
	}
}
