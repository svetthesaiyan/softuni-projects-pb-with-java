package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class d_vegetable_bazaar 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double vegetable_price=Double.parseDouble(scanner.nextLine());
		double fruit_price=Double.parseDouble(scanner.nextLine());
		int vegetable_weight=Integer.parseInt(scanner.nextLine());
		int fruit_weight=Integer.parseInt(scanner.nextLine());
		
		double vegetable_sum=vegetable_price*vegetable_weight;
		double fruit_sum=fruit_price*fruit_weight;
		double vegetable_and_fruit_sum=vegetable_sum+fruit_sum;
		
		double bgn_to_euro=vegetable_and_fruit_sum/1.94;
		
		System.out.printf("%.2f", bgn_to_euro);
	}
}
