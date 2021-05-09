package while_loop_lab;

import java.util.Scanner;

public class c_number_sum 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the initial number you'd like the subsequent numbers you input to equal to: ");
		int initialNumber=Integer.parseInt(scanner.nextLine());
		int sum=0;
		
		while(sum<initialNumber)
		{
			System.out.print("Enter another number: ");
			int number=Integer.parseInt(scanner.nextLine());
			sum+=number;
		}
		System.out.println("The subsequent numbers you entered have equalled or surpassed your initial number."+"\n"+"Their sum is: "+sum);
	}
}
