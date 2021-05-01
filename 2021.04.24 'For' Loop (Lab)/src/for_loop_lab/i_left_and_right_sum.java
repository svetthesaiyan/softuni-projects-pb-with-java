package for_loop_lab;

import java.util.Scanner;

public class i_left_and_right_sum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers per loop you can input: ");
		int numbersPerLoop=Integer.parseInt(scanner.nextLine());
		int loopOneSum=0;
		int loopTwoSum=0;
		
		for(int i=1; i<=numbersPerLoop; i++)
		{
			System.out.print("Enter number "+i+" for the 1st loop: ");
			int loopOneNumberValue=Integer.parseInt(scanner.nextLine());
			loopOneSum+=loopOneNumberValue;
		}
		System.out.println();
		
		for(int i=1; i<=numbersPerLoop; i++)
		{
			System.out.print("Enter number "+i+" for the 2nd loop: ");
			int loopTwoNumberValue=Integer.parseInt(scanner.nextLine());
			loopTwoSum+=loopTwoNumberValue;
		}
		System.out.println();
		
		if(loopOneSum==loopTwoSum)
			System.out.println("Both loops' sums are equivalent and equal to: "+loopOneSum);
		else 
			System.out.println("Both loops' sums aren't equivalent and their difference is equal to: "+Math.abs(loopTwoSum-loopOneSum));
	}
}
