package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class a_match_tickets
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your budget: ");
		double budget=Double.parseDouble(scanner.nextLine());
		System.out.print("Choose whether you'll be buying \"Normal\" or \"VIP\" tickets: ");
		String category=scanner.nextLine();
		System.out.print("Enter the amount of fans in your group: ");
		int fans=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double normalTicketPrice=249.99;
		double vipTicketPrice=499.99;
		
		double normalTotalPrice=normalTicketPrice*fans;
		double vipTotalPrice=vipTicketPrice*fans;
		
		double transportFees=0;
		
		if(fans<=4)
			transportFees=budget*0.75;
		
		else if(fans>=5 && fans<=9)
			transportFees=budget*0.6;
		
		else if(fans>=10 && fans<=24)
			transportFees=budget*0.5;
		
		else if(fans>=25 && fans<=49)
			transportFees=budget*0.4;
		
		else // (fans>50)
			transportFees=budget*0.25;
		
		if(category.equals("Normal"))
		{
			if((transportFees+normalTotalPrice)<=budget)
				System.out.printf("Yes! You'll have %.2f lv. left after purchasing all of those \"%s\" tickets.", (budget-(transportFees+normalTotalPrice)), category);
			else // ((transportFees+normalTotalPrice)>budget)
				System.out.printf("Not enough money! You need %.2f more lv. if you want to purchase all off those \"%s\" tickets.", ((transportFees+normalTotalPrice)-budget), category);
		}
		
		else // (category.equals("VIP"))
		{
			if((transportFees+vipTotalPrice)<=budget)
				System.out.printf("Yes! You'll have %.2f lv. left after purchasing all of those \"%s\" tickets.", (budget-(transportFees+vipTotalPrice)), category);
			else // ((transportFees+vipTotalPrice)>budget)
				System.out.printf("Not enough money! You need %.2f more lv. if you want to purchase all off those \"%s\" tickets.", ((transportFees+vipTotalPrice)-budget), category);
		}
	}
}
