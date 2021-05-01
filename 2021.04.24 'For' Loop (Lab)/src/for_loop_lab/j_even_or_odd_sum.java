package for_loop_lab;

import java.util.Scanner;

public class j_even_or_odd_sum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total amount of numbers you'd like to include in your loop: ");
		int numbersPerLoop=Integer.parseInt(scanner.nextLine());
		int evenSum=0;
		int oddSum=0;
		
		for(int i=1; i<=numbersPerLoop; i++)
		{
			System.out.print("Enter number "+i+": ");
			int value=Integer.parseInt(scanner.nextLine());
			
			if(i%2==0)
				evenSum+=value;
			else
				oddSum+=value;
		}
		System.out.println();
		
		if(evenSum==oddSum)
			System.out.println("Both even and odd sums are equivalent and equal to: "+evenSum);	// или +oddSum
		else
			System.out.println("The sums of the respective evenly and oddly input numbers aren't equivalent and their difference is equal to: "+Math.abs(evenSum-oddSum));
	}
}
