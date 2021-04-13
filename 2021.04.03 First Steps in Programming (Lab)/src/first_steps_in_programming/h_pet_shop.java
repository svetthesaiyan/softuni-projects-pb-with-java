package first_steps_in_programming;

import java.util.Scanner;

public class h_pet_shop 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter how many dogs you have to feed: ");
		int dog_quantity=Integer.parseInt(scanner.nextLine());
		double dog_food_price=2.5;
		double dog_food_expenses=dog_quantity*dog_food_price;
		
		System.out.print("Enter how many other animals you also have to buy food for: ");
		int not_dog_quantity=Integer.parseInt(scanner.nextLine());
		double not_dog_food_price=4;
		double not_dog_food_expenses=not_dog_quantity*not_dog_food_price;
		
		double dog_and_not_dog_total_expenses=dog_food_expenses+not_dog_food_expenses;
		
		System.out.println();
		System.out.printf("You owe %.2f lv. to the pet shop owner.", dog_and_not_dog_total_expenses);		
	}
}
