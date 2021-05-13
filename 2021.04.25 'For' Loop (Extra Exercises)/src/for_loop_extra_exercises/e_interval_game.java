package for_loop_extra_exercises;

import java.util.Scanner;

public class e_interval_game 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total allowed turns during the game: ");
		int turns=Integer.parseInt(scanner.nextLine());
		
		double points=0;
		
		double firstIntervalPercent=0;
		double secondIntervalPercent=0;
		double thirdIntervalPercent=0;
		double fourthIntervalPercent=0;
		double fifthIntervalPercent=0;
		double invalidIntervalPercent=0;
		
		for(int i=1; i<=turns; i++)
		{
			if(i==1)
				System.out.print("Enter a random number from \"-100\" to \"100\": ");
			else
				System.out.print("Enter another random number from \"-100\" to \"100\": ");
			int number=Integer.parseInt(scanner.nextLine());
			
			if(number>=0 && number<=9)
			{
				points+=number*0.2;
				firstIntervalPercent++;
			}
			else if(number>=10 && number<=19)
			{
				points+=number*0.3;
				secondIntervalPercent++;
			}
			else if(number>=20 && number<=29)
			{
				points+=number*0.4;
				thirdIntervalPercent++;
			}
			else if(number>=30 && number<=39)
			{
				points+=50;
				fourthIntervalPercent++;
			}
			else if(number>=40 && number<=50)
			{
				points+=100;
				fifthIntervalPercent++;
			}
			else // else if(number<0 || number>50)
			{
				points/=2;
				invalidIntervalPercent++;
			}
		}
		
		System.out.println();
		firstIntervalPercent=(firstIntervalPercent/turns)*100;
		secondIntervalPercent=(secondIntervalPercent/turns)*100;
		thirdIntervalPercent=(thirdIntervalPercent/turns)*100;
		fourthIntervalPercent=(fourthIntervalPercent/turns)*100;
		fifthIntervalPercent=(fifthIntervalPercent/turns)*100;
		invalidIntervalPercent=(invalidIntervalPercent/turns)*100;
		
		System.out.printf("You managed to accumulate a total of %.2f points during this playthrough!"+"\n", points);
		System.out.printf("The percentage of numbers which you input in the interval of 0 to 9 is %.2f%%"+"\n", firstIntervalPercent);
		System.out.printf("The percentage of numbers which you input in the interval of 10 to 19 is %.2f%%"+"\n", secondIntervalPercent);
		System.out.printf("The percentage of numbers which you input in the interval of 20 to 29 is %.2f%%"+"\n", thirdIntervalPercent);
		System.out.printf("The percentage of numbers which you input in the interval of 30 to 39 is %.2f%%"+"\n", fourthIntervalPercent);
		System.out.printf("The percentage of numbers which you input in the interval of 40 to 50 is %.2f%%"+"\n", fifthIntervalPercent);
		System.out.printf("The percentage of invalid numbers which you input is %.2f%%", invalidIntervalPercent);
	}
}
