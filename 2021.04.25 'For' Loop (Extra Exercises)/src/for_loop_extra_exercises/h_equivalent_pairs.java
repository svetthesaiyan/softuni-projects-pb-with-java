package for_loop_extra_exercises;

import java.util.Scanner;

public class h_equivalent_pairs
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many loops you'd like to go through: ");
		int numberOfLoops=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		int initialSum=0;
		int subsequentSum=0;
		int maxDifference=0;
		
		for(int i=1; i<=numberOfLoops; i++)
		{
			if(i==1)
			{
				System.out.print("Enter the first number for the initial sum: ");
				int initialSumFirstNumber=Integer.parseInt(scanner.nextLine());
				System.out.print("Enter the second number for the inital sum: ");
				int initialSumSecondNumber=Integer.parseInt(scanner.nextLine());
				initialSum=initialSumFirstNumber+initialSumSecondNumber;
			}
			else
			{
				System.out.println();
				System.out.print("Enter the first number for the subsequent sum: ");
				int subsequentSumFirstNumber=Integer.parseInt(scanner.nextLine());
				System.out.print("Enter the second number for the subsequent sum: ");
				int subsequentSumSecondNumber=Integer.parseInt(scanner.nextLine());
				subsequentSum=subsequentSumFirstNumber+subsequentSumSecondNumber;
				
				if((subsequentSum-initialSum!=0))
				{
					maxDifference=Math.abs(subsequentSum-initialSum);
					initialSum=subsequentSum; // шом веднъж изначалната двойка и последвалата я двойка от числа се различават, то нацяло отпада вариантът да са равни всички двойки и затова се присвоява стойността на предишната двойка, за да продължи цикъла
				}
			}
		}
		
		System.out.println();
		if(maxDifference!=0)
			System.out.print("The groups of numbers you input have differing sums."+"\n"+"The maximal difference in sums when looking at each duo of numbers consecutively is: "+maxDifference);
		else
			System.out.print("All groups of numbers have an identical sum, which is: "+initialSum);
	}
}
