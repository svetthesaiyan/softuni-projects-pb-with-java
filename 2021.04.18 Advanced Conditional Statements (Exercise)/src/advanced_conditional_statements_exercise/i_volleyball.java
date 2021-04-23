package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class i_volleyball 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose whether the current year is either a \"leap\" or a \"normal\" year: ");
		String yearType=scanner.nextLine();
		System.out.print("Enter how many bank holidays there are in said year: ");
		int holidayAmount=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter how many weekends you're going to spend at home: ");
		int weekendHomeAmount=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		int weekendSofiaAmount=48-weekendHomeAmount;
		
		double holidayAmountReal=holidayAmount*(2.0/3);
		double weekendSofiaAmountReal=weekendSofiaAmount*(3.0/4);
		
		double totalAmount=weekendSofiaAmountReal+holidayAmountReal+weekendHomeAmount;
		
		if(yearType.equals("leap"))
		{
			totalAmount*=1.15;
			System.out.printf("During this %s year you'll be able to play %.0f volleyball games.", yearType, Math.floor(totalAmount));
		}
		
		else if(yearType.equals("normal"))
			System.out.printf("During this %s year you'll be able to play %.0f volleyball games.", yearType, Math.floor(totalAmount));
	}
}
