package first_steps_in_programming_exercises;

import java.util.Scanner;

public class e_birthday 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the money you'll be loaning out: ");
		int loan=Integer.parseInt(scanner.nextLine());
		
		double cake=loan*0.2;
		System.out.println("You'll have to set aside "+cake+" lv. for the cake.");
		double refreshments=cake-(cake*0.45);
		System.out.println("You'll have to set aside "+refreshments+" lv. for refreshments.");
		double clown=loan*1/3;
		System.out.println("You'll have to set aside "+clown+" lv. for an entertainer.");
		
		double budget=loan+cake+refreshments+clown;
		
		System.out.println();
		System.out.println("Your birthday party budget is: "+budget+" lv.");
	}
}
