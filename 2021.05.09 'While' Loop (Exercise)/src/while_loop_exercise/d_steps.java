package while_loop_exercise;

import java.util.Scanner;

public class d_steps 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int stepGoal=10_000;
		int stepTotal=0;
		
		while(stepTotal<stepGoal)
		{
			System.out.print("Enter how many steps you walked today: ");
			String input=scanner.nextLine();
			if(input.equalsIgnoreCase("Going Home"))
			{
				System.out.print("Enter how many steps it takes for you to get back home from work: ");
				int stepToHome=Integer.parseInt(scanner.nextLine());
				stepTotal+=stepToHome;
				break;
			}
			
			int stepTakenCurrent=Integer.parseInt(input);
			stepTotal+=stepTakenCurrent;
		}
		
		System.out.println();
		if(stepTotal>=stepGoal)
			System.out.print("Goal reached! Good job!"+"\n"+"You took "+(stepTotal-stepGoal)+" additional steps over your original goal!");
		else
			System.out.print("You weren't active enough..."+"\n"+"You need to take "+(stepGoal-stepTotal)+" more steps in order to reach your set goal.");
	}
}
