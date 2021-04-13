package first_steps_in_programming;

import java.util.Scanner;

public class d_inch_to_cm 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the length in inches: ");
		double inches=Double.parseDouble(scanner.nextLine());
		double cm=inches*2.54;
		
		System.out.println("The length you set converted into centimetres is: "+cm);
	}
}
