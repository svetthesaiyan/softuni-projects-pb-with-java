package first_steps_in_programming_exercises;

import java.util.Scanner;

public class b_radians_to_degrees 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the radian you'd like to convert: ");
		double radians=Double.parseDouble(scan.nextLine());
		double radians_to_degrees=radians*180/Math.PI;
		
		System.out.println();
		System.out.printf("Your radian converted into degrees is %.0f.", radians_to_degrees);
	}
}
