package first_steps_in_programming_exercises;

import java.util.Scanner;

public class g_food_workshop 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Please enter the price of the strawberries per kilo: ");
		double strawberries_price=Double.parseDouble(scanner.nextLine());
		System.out.print("How many kilos of bananas would you like: ");
		double bananas_weight=Double.parseDouble(scanner.nextLine());
		System.out.print("How many kilos of oranges would you like: ");
		double oranges_weight=Double.parseDouble(scanner.nextLine());
		System.out.print("How many kilos of raspberries would you like: ");
		double raspberries_weight=Double.parseDouble(scanner.nextLine());
		System.out.print("How many kilos of strawberries would you like: ");
		double strawberries_weight=Double.parseDouble(scanner.nextLine());
		
		double strawberries_sum=strawberries_price*strawberries_weight;
		
		double raspberries_price=strawberries_price-(strawberries_price*0.5);
		double bananas_price=raspberries_price-(raspberries_price*0.8);
		double oranges_price=raspberries_price-(raspberries_price*0.4);
		
		double bananas_sum=bananas_price*bananas_weight;
		double oranges_sum=oranges_price*oranges_weight;
		double raspberries_sum=raspberries_price*raspberries_weight;
		
		System.out.println();
		System.out.printf("Your fruity purchase will cost: %.2f lv.", strawberries_sum+bananas_sum+oranges_sum+raspberries_sum);
	}
}
