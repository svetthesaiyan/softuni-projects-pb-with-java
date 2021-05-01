package for_loop_lab;

import java.util.Scanner;

public class g_numbers_sum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of numbers you'd like to summate: ");
		int numberAmount=Integer.parseInt(scanner.nextLine());
		int sum=0;
		
		for(int i=1; i<=numberAmount; i++)
		{
			// I'm quite proud of these conditional statements I managed to come up with in order to better contextualise the sequence of numbers. 😏
			if(i==11 || i==12 || i==13)
				System.out.print("Enter "+i+"th number: ");
			else if(i==1 || i%10==1)
				System.out.print("Enter "+i+"st number: ");
			else if(i==2 || i%10==2)
				System.out.print("Enter "+i+"nd number: ");
			else if(i==3 || i%10==3)
				System.out.print("Enter "+i+"rd number: ");
			else
				System.out.print("Enter "+i+"th number: ");

			int value=Integer.parseInt(scanner.nextLine());
			sum+=value;
		}
		System.out.println();
		System.out.println("The sum of the numbers you input is: "+sum);
	}
}
