package for_loop_lab;

import java.util.Scanner;

public class k_clever_lily 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Lily's current age: ");
		int age=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the price of the washing machine Lily wants to purchase: ");
		double washingMachinePrice=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the price per toy that Lily sold her dolls for: ");
		double toyPrice=Double.parseDouble(scanner.nextLine());
		System.out.println();
		
		int toyCount=0;
		double moneyFromBdays=0;
		double moneyAfterBrotherSteals=0;
		
		for(int i=1; i<=age; i++)
		{
			if(i%2==0)
			{
				moneyFromBdays+=10;
				moneyAfterBrotherSteals+=moneyFromBdays-1;
			}
			else // нечетен рожден ден
				toyCount++;
		}
		
		double moneyTotal=(toyCount*toyPrice)+moneyAfterBrotherSteals;
		
		if(moneyTotal>=washingMachinePrice)
			System.out.printf("Lily has saved up enough money over the years to buy her dream washing machine!"+"\n"+"She'll be left with %.2f lv. after the purchase.", moneyTotal-washingMachinePrice);
		else
			System.out.printf("Lily doesn't have enough money to afford her dream washing machine..."+"\n"+"She needs %.2f more lv. if she'd like to buy it.", washingMachinePrice-moneyTotal);
	}
}
