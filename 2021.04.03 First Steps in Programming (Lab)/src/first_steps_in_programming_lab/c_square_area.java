package first_steps_in_programming_lab;

import java.util.Scanner;

public class c_square_area 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the length of the square's side: ");
		double a=Double.parseDouble(scanner.nextLine());
		double area=a*a;
		
		System.out.println("The area of your square is: "+area);
		// System.out.printf("The area of your square is: %.2f", area); -decimal precision set to hundredths max
	}
}
