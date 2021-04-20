package conditional_statements_extra_exercises;

import java.util.Scanner;

public class f_pets 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter how many days the pets' owner will be absent: ");
		int days=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how much food the pets' owner has left for them to eat in kilograms: ");
		int foodInKg=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how much food the dog eats per day in kilograms: ");
		double foodPerDayForDoginKg=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter how much food the cat eats per day in kilograms: ");
		double foodPerDayForCatinKg=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter how much food the turtle eats per day in grams: ");
		double foodPerDayForTurtleinKg=Double.parseDouble(scanner.nextLine())/1000;
		System.out.println();
		
		double requiredFoodInKg=days*(foodPerDayForDoginKg+foodPerDayForCatinKg+foodPerDayForTurtleinKg);
		
		if(foodInKg>=requiredFoodInKg)
			System.out.printf("%.0f spare kilos of food left."+"\n"+"Well done on being a responsible owner!", Math.floor(foodInKg-requiredFoodInKg));
		else
			System.out.printf("Are you serious? %.0f more kilos of food are needed. You're going to starve the poor things...", Math.ceil(requiredFoodInKg-foodInKg));
	}
}
