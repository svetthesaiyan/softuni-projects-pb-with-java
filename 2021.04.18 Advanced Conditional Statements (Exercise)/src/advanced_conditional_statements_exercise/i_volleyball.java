package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class i_volleyball 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String yearType=scanner.nextLine();
		int holidayAmount=Integer.parseInt(scanner.nextLine());
		int weekendHomeAmount=Integer.parseInt(scanner.nextLine());
		
		int weekendSofiaAmount=48-weekendHomeAmount;
		
		double holidayAmountReal=holidayAmount*(2.0/3);
		double weekendSofiaAmountReal=weekendSofiaAmount*(3.0/4);
		
		double totalAmount=weekendSofiaAmountReal+holidayAmountReal+weekendHomeAmount;
		
		if(yearType.equals("leap"))
		{
			totalAmount*=1.15;
			System.out.printf("%.0f", Math.floor(totalAmount));
		}
		
		else if(yearType.equals("normal"))
			System.out.printf("%.0f", Math.floor(totalAmount));
	}
}
