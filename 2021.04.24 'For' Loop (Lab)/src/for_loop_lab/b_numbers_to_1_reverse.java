package for_loop_lab;

import java.util.Scanner;

public class b_numbers_to_1_reverse 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int startingNumber=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Here are all of the numbers from "+startingNumber+" to 1!");
		
		for(int number=startingNumber; number>=1; number--)
			System.out.println(number);
	}
}
