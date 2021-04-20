package conditional_statements_extra_exercises;

import java.util.Scanner;

public class e_firm 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the necessary hours the company would need in order to get the project over the line: ");
		int necessaryHours=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many days the client has given the company to complete the task: ");
		int mandatedDays=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many workers are going to work overtime to help complete the job: ");
		int surplusWorkers=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double maxHours=Math.floor((mandatedDays-(mandatedDays*0.1))*8+(mandatedDays*2*surplusWorkers));
		
		
		if(maxHours>=necessaryHours)
			System.out.printf("Great job! We finished the project and with time to spare! %.0f hours left to be exact.", Math.floor(maxHours-necessaryHours));
		
		else
			System.out.printf("Oh no, we're running behind schedule... %.0f more hours are needed.", Math.floor(necessaryHours-maxHours));
	}
}
