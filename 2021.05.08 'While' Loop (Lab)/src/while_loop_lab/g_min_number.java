package while_loop_lab;

import java.util.Scanner;

public class g_min_number 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter however many numbers you like and I'll find the minimal value."+"\n"+"Write \"Stop\" when you're done inputting numbers.");
		String text=scanner.nextLine();
		int min=Integer.MAX_VALUE;
		
		while(!text.equals("Stop"))
		{
			int number=Integer.parseInt(text);
			if(number<min)
				min=number;
			
			text=scanner.nextLine();
		}
		System.out.print("The minimal value among the numbers you input is: "+min);
	}
}
