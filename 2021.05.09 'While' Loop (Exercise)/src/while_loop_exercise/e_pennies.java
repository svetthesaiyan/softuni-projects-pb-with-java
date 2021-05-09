package while_loop_exercise;

import java.util.Scanner;

public class e_pennies 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how much change you have in lv: ");
		double changeInLeva=Double.parseDouble(scanner.nextLine());

		double changeInStotinki=Math.round(changeInLeva*100);
		int coinCounter=0;
		
		while(changeInStotinki>0)
		{
			if(changeInStotinki>=200) // за двулевка
			{
				changeInStotinki-=200;
				coinCounter++;
			}
			else if(changeInStotinki>=100) // за еднолевка
			{
				changeInStotinki-=100;
				coinCounter++;
			}
			else if(changeInStotinki>=50) // за 50 стотинки
			{
				changeInStotinki-=50;
				coinCounter++;
			}
			else if(changeInStotinki>=20) // за 20 стотинки
			{
				changeInStotinki-=20;
				coinCounter++;
			}
			else if(changeInStotinki>=10) // за 10 стотинки
			{
				changeInStotinki-=10;
				coinCounter++;
			}
			else if(changeInStotinki>=5) // за 5 стотинки
			{
				changeInStotinki-=5;
				coinCounter++;
			}
			else if(changeInStotinki>=2) // за 2 стотинки
			{
				changeInStotinki-=2;
				coinCounter++;
			}
			else if(changeInStotinki>=1) // за 1 стотинка
			{
				changeInStotinki-=1;
				coinCounter++;
			}
		}
		System.out.printf("The minimal amount of coins %.2f lv. is comprised from is %d pennies.", changeInLeva, coinCounter);
	}
}
