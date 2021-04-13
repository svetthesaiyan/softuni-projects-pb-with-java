package first_steps_in_programming_exercises;

import java.util.Scanner;

public class f_charity 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("How long will this event last (in days): ");
		int event_duration=Integer.parseInt(scanner.nextLine()); 
		System.out.print("How many chefs will be taking part: ");
		int pastry_chef_quantity=Integer.parseInt(scanner.nextLine());
		System.out.print("How many cakes are going to be baked: ");
		int cake_quantity=Integer.parseInt(scanner.nextLine());
		System.out.print("How many waffles are going to be made: ");
		int waffle_quantity=Integer.parseInt(scanner.nextLine());
		System.out.print("How many pancakes are going to be made: ");
		int pancake_quantity=Integer.parseInt(scanner.nextLine());
		
		double cake_price=45;
		double waffle_price=5.8;
		double pancake_price=3.2;
		
		double cake_sum=cake_quantity*cake_price;
		double waffle_sum=waffle_quantity*waffle_price;
		double pancake_sum=pancake_quantity*pancake_price;
		double pastry_sum=cake_sum+waffle_sum+pancake_sum;
		
		double pastry_chef_sum=pastry_chef_quantity*pastry_sum;
		double event_sum=event_duration*pastry_chef_sum;
		System.out.println();
		System.out.printf("How much revenue the event will generate: %.2f lv.", event_sum);
		
		double food_expenses=event_sum -(event_sum*1/8);
		
		System.out.println();
		System.out.printf("Finances left from our charity event after we pay for the culinary expenses: %.2f lv.", food_expenses);
	}
}
