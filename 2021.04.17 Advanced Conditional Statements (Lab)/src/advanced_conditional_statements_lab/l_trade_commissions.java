package advanced_conditional_statements_lab;

import java.util.Scanner;

public class l_trade_commissions 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the city you're business is based in: ");
		String town=scanner.nextLine();
		System.out.print("Enter your annual revenue: ");
		double sales=Double.parseDouble(scanner.nextLine());
		System.out.println();
		System.out.print("Your commission fee is: ");
		
		double commissionFee=sales;
		
		if(sales>=0) 
		{
		switch(town)
		{
		case "Sofia":
			if(sales>=0 && sales<=500)
				System.out.printf("%.2f", commissionFee*0.05);
			else if(sales>500 && sales<=1000)
				System.out.printf("%.2f", commissionFee*0.07);
			else if(sales>1000 && sales <=10_000)
				System.out.printf("%.2f", commissionFee*0.08);
			else if(sales>10_000)
				System.out.printf("%.2f", commissionFee*0.12);
		break;
		
		case "Varna":
			if(sales>=0 && sales<=500)
				System.out.printf("%.2f", commissionFee*0.045);
			else if(sales>500 && sales<=1000)
				System.out.printf("%.2f", commissionFee*0.075);
			else if(sales>1000 && sales <=10_000)
				System.out.printf("%.2f", commissionFee*0.1);
			else if(sales>10_000)
				System.out.printf("%.2f", commissionFee*0.13);
		break;
		
		case "Plovdiv":
			if(sales>=0 && sales<=500)
				System.out.printf("%.2f", commissionFee*0.055);
			else if(sales>500 && sales<=1000)
				System.out.printf("%.2f", commissionFee*0.08);
			else if(sales>1000 && sales <=10_000)
				System.out.printf("%.2f", commissionFee*0.12);
			else if(sales>10_000)
				System.out.printf("%.2f", commissionFee*0.145);
			break;
		default: 
			System.out.println("error");
		}
		}
		else if(sales<0)
			System.out.println("error");
	}
}
