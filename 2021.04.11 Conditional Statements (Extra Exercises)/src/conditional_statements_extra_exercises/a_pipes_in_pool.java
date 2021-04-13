package conditional_statements_extra_exercises;

import java.util.Scanner;

public class a_pipes_in_pool 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int volume=Integer.parseInt(scanner.nextLine());
		int pipePerHour1=Integer.parseInt(scanner.nextLine());
		int pipePerHour2=Integer.parseInt(scanner.nextLine());
		double hours=Double.parseDouble(scanner.nextLine());
		
		double pipePerHour1Fill=pipePerHour1*hours;
		double pipePerHour2Fill=pipePerHour2*hours;
		double poolFill=hours*(pipePerHour1+pipePerHour2);	// poolFill=pipePerHour1Fill+pipePerHour2Fill;
		double poolOccupancyInPercent=poolFill/volume*100;	
		double pipePerHour1poolFillOccupancyInPercent=pipePerHour1Fill/poolFill*100;
		double pipePerHour2poolFillOccupancyInPercent=pipePerHour2Fill/poolFill*100;
		
		if(poolFill<=volume)
		{
			System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolOccupancyInPercent, pipePerHour1poolFillOccupancyInPercent, pipePerHour2poolFillOccupancyInPercent);
		}
		else
		{
			System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, poolFill-volume);
		}
	}
}
