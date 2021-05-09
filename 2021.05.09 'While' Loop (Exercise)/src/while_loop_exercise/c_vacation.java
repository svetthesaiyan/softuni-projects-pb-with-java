package while_loop_exercise;

import java.util.Scanner;

public class c_vacation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the price of your vacation: ");
		double vacationCost=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter how much money you have currently saved up: ");
		double availableCash=Double.parseDouble(scanner.nextLine());
		
		int days=0;
		int daysSpendStreak=0;
		
		while(availableCash<vacationCost && daysSpendStreak<5)
		{
			System.out.println();
			System.out.println("Be honest and tell me whether you spent money today or if you instead set aside a few leva like you should have if you truly want to go on vacation.");
			String spendOrSave=scanner.nextLine();
			System.out.print("Enter the amount of money you spent/saved: ");
			double cash=Double.parseDouble(scanner.nextLine());
			days++;
			
			if(spendOrSave.equals("spend"))
			{
				availableCash-=cash;
				daysSpendStreak++;
				
				if(availableCash<0)
					availableCash=0;
			}
			else if(spendOrSave.equals("save"))
			{
				availableCash+=cash;
				daysSpendStreak=0;
			}
		}
		
		System.out.println();
		if(availableCash>=vacationCost)
			System.out.printf("You managed to save up enough money for your vacation and it only took you %d days!"+"\n"+"You'll be left with %.2f lv after paying for all of the holiday expenses.", days, (availableCash-vacationCost));
		
		if(daysSpendStreak==5)
			System.out.println("You spent 5 consecutive days wasting your money on all sorts of rubbish and as a result didn't save up enough to go on vacation! 🤦🏻‍♂️");
	}
}
