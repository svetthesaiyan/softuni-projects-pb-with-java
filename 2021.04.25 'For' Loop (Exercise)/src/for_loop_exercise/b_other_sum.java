package for_loop_exercise;

import java.util.Scanner;

public class b_other_sum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers you'd like to work with: ");
		int maxNumber=Integer.parseInt(scanner.nextLine());
		int sum=0;
		int max=Integer.MIN_VALUE;
		
		for(int i=1; i<=maxNumber; i++)
		{
			System.out.print("Enter number "+i+": ");
			int number=Integer.parseInt(scanner.nextLine());
			sum+=number;
			
			if(number>max)
				max=number;
		}
		System.out.println();
		
		sum-=max;
		
		if(max==sum)
			System.out.println("The highest number is coincidentally equal to the sum of the other numbers you input."+"\n"+"That number is: "+max);
		else 
			System.out.printf("The highest number isn't equal to the sum of the rest of the numbers you input.%nThe difference is: %d", Math.abs(sum-max));
	}
}
