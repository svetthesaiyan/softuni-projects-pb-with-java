package while_loop_lab;

import java.util.Scanner;

public class d_sequence_2k_plus_1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=Integer.parseInt(scanner.nextLine());
		
		int number=1;
		System.out.println("Here are all of the numbers up to "+n+" which get calculated according to a top secret formula.");
		
		while(number<=n)
		{
			System.out.println(number);
			number=number*2+1;
		}
	}
}
