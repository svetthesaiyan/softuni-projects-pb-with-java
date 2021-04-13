package first_steps_in_programming_exercises;

import java.util.Scanner;

public class c_mortgage_calculator 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("/Client/"+"\t"+"Please enter your deposit: ");
		double deposit=Double.parseDouble(scanner.nextLine());
		System.out.print("/Banker/"+"\t"+"This is how much time (in months) we're giving you to us back the loan: ");
		int timeframe=Integer.parseInt(scanner.nextLine());
		System.out.print("/Banker/"+"\t"+"This is our rate: ");
		double rate=Double.parseDouble(scanner.nextLine())/100;

		double sum=deposit+timeframe*((deposit*rate)/12);
		
		System.out.println();
		System.out.println("Your mortgage is: "+sum);
	}
}
