package conditional_statement_exercise;

import java.util.Scanner;

public class g_swimming_world_record 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the current swimming world record: ");
		double record=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the swimming distance in metres: ");
		double distance=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the time it takes for the competitor to swim a metre in seconds: ");
		double timeInSec=Double.parseDouble(scanner.nextLine());
		double result=distance*timeInSec;
		
		// забавяне заради течение
		double slowdown=(Math.floor(distance/15))*12.5;
		double finalResult=result+slowdown;
		
		if(finalResult<record)
		{
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
		}
		else if(finalResult==record)
		{
			System.out.print("So close! He tied the record but wasn't able to beat it.");
		}
		else
			System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(finalResult-record));
	}
}
