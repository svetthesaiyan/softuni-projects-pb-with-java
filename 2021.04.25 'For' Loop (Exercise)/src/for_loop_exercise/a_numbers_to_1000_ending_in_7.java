package for_loop_exercise;

import java.util.Scanner;

public class a_numbers_to_1000_ending_in_7 
{
	public static void main(String[] args) 
	{
		System.out.println("Here are all of the numbers to 1000 ending in '7'!");

		for(int number=7; number<=997; number++)
		{
			if(number%10==7)
				System.out.println(number);
		}
	}
}
