package while_loop_lab;

import java.util.Scanner;

public class a_read_text 
{
	public static void main(String[] args) 
	{
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(i);
//		}
		
//		е същото като:
		
//		int number=1;
//		
//		while(number<=10)
//		{
//			System.out.println(number);
//			number++;
//		}
		
		Scanner scanner = new Scanner(System.in);
		String text=scanner.nextLine();
		
		while(!text.equals("Stop"))
		{
			System.out.println("You wrote: "+text);
			text=scanner.nextLine();
		}
	}
}
