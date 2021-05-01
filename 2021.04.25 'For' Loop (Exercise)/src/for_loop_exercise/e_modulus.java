package for_loop_exercise;

import java.util.Scanner;

public class e_modulus
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers you'd like to work with: ");
		int maxNumber=Integer.parseInt(scanner.nextLine());
		
		double percent1=0;
		double percent2=0;
		double percent3=0;
		
		for(int i=1; i<=maxNumber; i++)
		{
			System.out.print("Enter "+i+" number: ");
			int number=Integer.parseInt(scanner.nextLine());
			
			if(number%2==0)
				percent1++;
			if(number%3==0)
				percent2++;
			if(number%4==0)
				percent3++;
		}
		System.out.println();
		System.out.printf("%.2f%% of the number(s) you input are divisible by 2."+"\n", percent1/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input are divisible by 3."+"\n", percent2/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input are divisible by 4."+"\n", percent3/maxNumber*100);
	}
}
