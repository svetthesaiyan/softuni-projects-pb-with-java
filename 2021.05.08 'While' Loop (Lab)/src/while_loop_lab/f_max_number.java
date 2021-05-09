package while_loop_lab;

import java.util.Scanner;

public class f_max_number 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter however many numbers you like and I'll find the maximal value."+"\n"+"Write \"Stop\" when you're done inputting numbers.");
		String text=scanner.nextLine();
		int max=Integer.MIN_VALUE;
				
		while(!text.equals("Stop"))
		{
			int number=Integer.parseInt(text); 
			if(number>max)
				max=number;
			
			text=scanner.nextLine();
		}
		System.out.println("The maximal value among the numbers you input is: "+max);
	}
}
