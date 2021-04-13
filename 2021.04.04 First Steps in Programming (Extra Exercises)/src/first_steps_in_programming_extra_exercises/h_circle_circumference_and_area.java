package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class h_circle_circumference_and_area 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double r=Double.parseDouble(scanner.nextLine());
		
		double circleArea=Math.PI*(r*r);
		double circleCircumference=2*(Math.PI*r);
		
		System.out.printf("%.2f%n", circleArea);
		System.out.printf("%.2f", circleCircumference);
	}
}
