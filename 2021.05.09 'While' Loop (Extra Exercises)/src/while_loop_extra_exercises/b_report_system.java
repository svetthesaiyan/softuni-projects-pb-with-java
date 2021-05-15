package while_loop_extra_exercises;

import java.util.Scanner;

public class b_report_system 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of money the charity event is aiming to raise: ");
		int requiredMoney=Integer.parseInt(scanner.nextLine());
		
		int moneyTotal=0;
		double moneyCashTotal=0;
		double moneyCardTotal=0;
		
		int paymentCounter=0;
		int paymentCashCounter=0;
		int paymentCardCounter=0;
		
		boolean isMoneyEnough=false;
		
		System.out.println("Enter the individual prices of the items being sold at the charity auction."+"\n"+"Type \"End\" when there's no more items to sell. I'll step in should you reach your monetary goal prematurely.");
		String input=scanner.nextLine();
		while(!input.equalsIgnoreCase("End"))
		{
			int itemPrice=Integer.parseInt(input);
			
			paymentCounter++;
			if(paymentCounter%2==0)
			{
				if(itemPrice<10)
					System.out.println("Error in transaction!"+"\n"+"You can't pay with card for that.");
				else
				{
					paymentCardCounter++;
					System.out.println("Product sold!"+"\n"+"Thanks for taking part in a noble cause. ☺");
					moneyCardTotal+=itemPrice;
					moneyTotal+=itemPrice;
				}
			}
			else
			{
				
				if(itemPrice>100)
					System.out.println("Error in transaction!"+"\n"+"You can't pay in cash for that.");
				else
				{
					paymentCashCounter++;
					System.out.println("Product sold!"+"\n"+"Thanks for taking part in a noble cause. ☺");
					moneyCashTotal+=itemPrice;
					moneyTotal+=itemPrice;
				}
			}
			
			if(moneyTotal>=requiredMoney)
			{
				isMoneyEnough=true;
				break;
			}
			
			input=scanner.nextLine();
		}
		
		System.out.println();
		if(isMoneyEnough)
			System.out.printf("Average CS: %.2f lv."+"\n"+"Average CC: %.2f lv.", (moneyCashTotal/paymentCashCounter), (moneyCardTotal/paymentCardCounter));
		else
			System.out.print("Failed to reach monetary goal for charity.");
	}
}
