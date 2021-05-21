package nested_loops_lab;

import java.util.Scanner;

public class c_combinations 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number which I'll try to summate via gathering 3 other numbers that are smaller or equal to said number and which start from 0: ");
		int number=Integer.parseInt(scanner.nextLine());
		int counter=0;
		
		System.out.println("Here are all of the possible triple addition combinations that equal "+number+".");
		for(int x1=0; x1<=number; x1++)
		{
			for(int x2=0; x2<=number; x2++)
			{
				for(int x3=0; x3<=number; x3++)
				{
					if(x1+x2+x3==number)
					{
						System.out.println(x1+"+"+x2+"+"+x3+"="+number);
						counter++;
					}
				}
			}
		}
		System.out.println();
		System.out.print("That's a total of "+counter+" different ways you can reach the number "+number+" with the help of my top-secret arithmetic trio. 😈");
	}
}
