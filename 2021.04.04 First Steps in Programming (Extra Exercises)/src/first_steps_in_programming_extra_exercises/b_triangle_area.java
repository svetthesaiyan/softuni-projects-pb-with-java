package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class b_triangle_area 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		double a=Double.parseDouble(scanner.nextLine());
		double h=Double.parseDouble(scanner.nextLine());
		
		double area=a*h/2;
		
		System.out.printf("%.2f", area);
	}
}
