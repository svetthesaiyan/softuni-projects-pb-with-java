package for_loop_extra_exercises;

import java.util.Scanner;

public class a_back_to_the_past 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the money Ivancho has inherited after coming of age: ");
		double willMoney=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the year in which Ivancho dies after going back in time: ");
		int deathYear=Integer.parseInt(scanner.nextLine());
		
		int startingAge=18;
		int oddYearAge =0;
		
		double totalMoney=0;
		double expensesEvenYear=12_000;
		double expensesOddYear =12_000;
		
		for(int currentYear=1800; currentYear<=deathYear; currentYear++)
		{
			if(currentYear%2==0)
				totalMoney+=expensesEvenYear;
			else if(currentYear%2!=0)
			{
				oddYearAge =startingAge+(currentYear-1800);
				totalMoney+=expensesOddYear+(50*oddYearAge);
			}
		}
		
		System.out.println();
		if(willMoney>=totalMoney)
			System.out.printf("Ivancho has inherited enough money to live a carefree life after going back in time!"+"\n"+"He will have %.2f lv. left after passing away.", (willMoney-totalMoney));
		else if(willMoney<totalMoney)
			System.out.printf("Uh oh, it seems Ivancho won't have enough finances to live through to the end of his days."+"\n"+"He will need %.2f more lv. in order to survive.", (totalMoney-willMoney));
	}
}
