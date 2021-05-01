package for_loop_lab;

import java.util.Scanner;

public class c_numbers_to_n_through_3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int maxNumber=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Here are all of the numbers to "+maxNumber+" that are divisible by 3!");
		
		for(int number=0; number<=maxNumber; number+=3)
		{
			boolean isZero=number==0; // за да не излиза 0 като първо число
			
			if(!isZero)
				System.out.println(number);
		}
	}
}
