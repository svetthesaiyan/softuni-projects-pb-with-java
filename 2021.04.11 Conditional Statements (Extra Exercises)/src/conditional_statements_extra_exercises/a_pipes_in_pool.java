package conditional_statements_extra_exercises;

import java.util.Scanner;

public class a_pipes_in_pool 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the pool's volume in litres: ");
		int volume=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the first pipe's water flow rate per hour: ");
		int pipePerHour1=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the second pipe's water flow rate per hour: ");
		int pipePerHour2=Integer.parseInt(scanner.nextLine());
		System.out.print("Enther the amount of time the worker will be missing in hours: ");
		double hours=Double.parseDouble(scanner.nextLine());
		System.out.println();
		
		double pipePerHour1Fill=pipePerHour1*hours;
		double pipePerHour2Fill=pipePerHour2*hours;
		double poolFill=hours*(pipePerHour1+pipePerHour2);	// poolFill=pipePerHour1Fill+pipePerHour2Fill;
		double poolOccupancyInPercent=poolFill/volume*100;	
		double pipePerHour1poolFillOccupancyInPercent=pipePerHour1Fill/poolFill*100;
		double pipePerHour2poolFillOccupancyInPercent=pipePerHour2Fill/poolFill*100;
		
		if(poolFill<=volume)
			System.out.printf("The pool would be %.2f%% full after %.1f hours of constant water supply."+"\n"+"Pipe 1 would've filled %.2f%% of the occupied pool volume."+"\n"+"Pipe 2 on the other hand would be responsible for the other %.2f%%.", poolOccupancyInPercent, hours, pipePerHour1poolFillOccupancyInPercent, pipePerHour2poolFillOccupancyInPercent);
		else
			System.out.printf("If the worker were to be away for %.1f hours, the pool would overflow with %.2f litres.", hours, poolFill-volume);
	}
}
