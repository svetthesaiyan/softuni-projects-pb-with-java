package first_steps_in_programming;

import java.util.Scanner;

public class i_yard_greening 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the area of your yard: ");
		double yard_area=Double.parseDouble(scanner.nextLine());
		
		double greening_price=7.61;
		double yard_greening_no_discount=yard_area*greening_price;
		double yard_greening_discount=yard_greening_no_discount*0.18;
		double yard_greening_with_discount=yard_greening_no_discount-yard_greening_discount;
		
		System.out.println();
		System.out.printf("The final price is %.2f lv.", yard_greening_with_discount);
		System.out.println();
		System.out.printf("The discount is %.2f lv.", yard_greening_discount);
	}
}
