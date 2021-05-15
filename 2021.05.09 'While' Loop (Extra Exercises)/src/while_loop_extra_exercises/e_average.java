package while_loop_extra_exercises;

import java.util.Scanner;

public class e_average 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers you'd like to input and whose average you'd like for me to subsequently calculate: ");
		int numberCap=Integer.parseInt(scanner.nextLine());
		
		double numberSum=0;
		double average=0;
		
		int loopCounter=1;
		while(loopCounter<=numberCap)
		{
			System.out.print("Enter number №"+loopCounter+": ");
			int number=Integer.parseInt(scanner.nextLine());
			numberSum+=number;
			average=numberSum/loopCounter;
			
			loopCounter++;
		}
		System.out.println();
		System.out.printf("The average of all the numbers you input is: %.2f", average);
	}
}
