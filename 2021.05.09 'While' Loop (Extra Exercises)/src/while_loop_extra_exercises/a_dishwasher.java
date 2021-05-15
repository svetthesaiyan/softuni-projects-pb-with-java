package while_loop_extra_exercises;

import java.util.Scanner;

public class a_dishwasher 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of detergent bottles Gosho has at his disposal: ");
		int detergentBottleCount=Integer.parseInt(scanner.nextLine());
		
		int detergentBottleFillTotal=detergentBottleCount*750;
		int detergentForPlates=0;
		int detergentForSaucePans=0;
		int detergentRequired=0;
		
		int dishwasherCycleCount=0;
		int platesCleanedCount=0;
		int saucepansCleanedCount=0;
		
		boolean isDetergentEnough=true;
		
		System.out.println("Enter how many plates/saucepans Gosho needs to put in the dishwasher."+"\n"+"Type \"End\" when Gosho runs out of dishes to clean.");
		String input=scanner.nextLine();
		while(!input.equalsIgnoreCase("End"))
		{
			int dishesToCleanCurrent=Integer.parseInt(input);
			
			dishwasherCycleCount++;
			if(dishwasherCycleCount%3==0)
				saucepansCleanedCount+=dishesToCleanCurrent;
			else
				platesCleanedCount+=dishesToCleanCurrent;
			
			detergentForSaucePans=saucepansCleanedCount*15;
			detergentForPlates=platesCleanedCount*5;
			detergentRequired=detergentForPlates+detergentForSaucePans;
			
			if(detergentRequired>detergentBottleFillTotal)
			{
				isDetergentEnough=false;
				break;
			}
			
			input=scanner.nextLine();
		}
		
		System.out.println();
		if(!isDetergentEnough)
			System.out.print("Gosho doesn't have enough detergent to clean all of those dirty plates and pans."+"\n"+"He needs "+(detergentRequired-detergentBottleFillTotal)+" more ml. of detergent.");
		else
			System.out.print("There was enough detergent for everything to be cleaned!"+"\n"+platesCleanedCount+" plates and "+saucepansCleanedCount+" pots were washed."+"\n"+"There's "+(detergentBottleFillTotal-detergentRequired)+" ml. of leftover detergent.");
	}	
}
