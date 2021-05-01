package for_loop_exercise;

import java.util.Scanner;

public class c_even_or_odd_position {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers you'd like to work with: ");
		int maxNumber=Integer.parseInt(scanner.nextLine());
		
		double oddSum=0;
		double oddMin=1000000000.0;
		double oddMax=-1000000000.0;
		
		double evenSum=0;
		double evenMin=1000000000.0;
		double evenMax=-1000000000.0;
		
		for(int i=1; i<=maxNumber; i++)
		{
			System.out.print("Enter number "+i+": ");
			double value=Double.parseDouble(scanner.nextLine());
			
			if(i%2==0)
			{
				evenSum+=value;
				
				if(value>evenMax)
					evenMax=value;
				if(value<evenMin)
					evenMin=value;
			}
			else
			{
				oddSum+=value;
				
				if(value>oddMax)
					oddMax=value;
				if(value<oddMin)
					oddMin=value;
			}
		}
		System.out.println();
		
		System.out.printf("The sum of the oddly input numbers is: %.2f,"+"\n", oddSum);
		if(oddMin==1000000000.0)
			System.out.println("There is no oddly input minimal number,");
		else
			System.out.printf("The minimal oddly input number is: %.2f,"+"\n", oddMin);
		if(oddMax==-1000000000.0)
			System.out.println("There is no oddly input maximal number,");
		else
			System.out.printf("The maximal oddly input number is: %.2f,"+"\n", oddMax);
		
		System.out.printf("The sum of the evenly input numbers is: %.2f,"+"\n", evenSum);
		if(evenMin==1000000000.0)
			System.out.println("There is no evenly input minimal number,");
		else
			System.out.printf("The minimal evenly input number is: %.2f,"+"\n", evenMin);
		if(evenMax==-1000000000.0)
			System.out.println("There is no maximal evenly input number");
		else
			System.out.printf("The maximal evenly input number is: %.2f"+"\n", evenMax);
	}
}
