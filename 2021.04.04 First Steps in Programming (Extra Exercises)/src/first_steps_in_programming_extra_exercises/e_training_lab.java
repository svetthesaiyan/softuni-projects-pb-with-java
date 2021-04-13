package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class e_training_lab 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter hall width: ");
		double width=Double.parseDouble(scanner.nextLine())*100;	// метри в сантиметри
		System.out.print("Enter hall length: ");
		double length=Double.parseDouble(scanner.nextLine())*100;	// метри в сантиметри
		
		if(300<=length&&length<=width&&width<=10000)	// ограниченията от метри в сантиметри
		{
			double desks_per_row_width=(width-100)/120;
			System.out.printf("This is how many desks we can fit according to the width of the hall: %.0f", desks_per_row_width);
			System.out.println();
			double desks_per_row_length=length/70;
			System.out.printf("This is how many desks we can fit according to the length of the hall: %.0f", desks_per_row_length);
			System.out.println();
		
			double work_space=(Math.floor(desks_per_row_width)*Math.floor(desks_per_row_length))-3;	
		
			System.out.println("This is how many workspaces we can fit in the designated hall: "+(int)work_space);
		}
	}
}
