package for_loop_lab;

import java.util.Scanner;

public class d_two_to_the_power_of_even_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the highest power for the number two you'd like calculated: ");
		int maxPower=Integer.parseInt(scanner.nextLine());
		
		System.out.println("Here is the number 2 raised to only the even powers of max "+maxPower+"!");
		
		for(int power=0; power<=maxPower; power+=2)
			System.out.printf("%.0f%n", Math.pow(2, power));
		
//		for(int power=0; power<=n; power++)
//			System.out.printf("%.0f"+"\n", Math.pow(2, power));
			
	}
}
