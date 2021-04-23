package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class b_bike_race 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of rookie cyclists: ");
		int juniorCyclists=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of veteran cyclists: ");
		int seniorCyclists=Integer.parseInt(scanner.nextLine());
		System.out.print("Choose whether the track they'll be racing on is either \"trail\", \"cross-country\", \"downhill\" or \"road\": ");
		String trackType=scanner.nextLine();
		System.out.println();
		
		int totalCyclists=juniorCyclists+seniorCyclists;
		
		double juniorFunds=0;
		double seniorFunds=0;
		double totalFunds=0;
		
		switch(trackType)
		{
			case "trail":
				juniorFunds=juniorCyclists*5.5;
				seniorFunds=seniorCyclists*7;
				totalFunds=(juniorFunds+seniorFunds)*0.95;
				System.out.printf("Total funds raised: %.2f", totalFunds);
				break;
				
			case "cross-country":
				juniorFunds=juniorCyclists*8;
				seniorFunds=seniorCyclists*9.5;
				totalFunds=(juniorFunds+seniorFunds)*0.95;
				
				if(totalCyclists>=50)
				{
					totalFunds*=0.75;
					System.out.printf("Total funds raised: %.2f", totalFunds);
				}
				else
					System.out.printf("Total funds raised: %.2f", totalFunds);
				break;
				
			case "downhill":
				juniorFunds=juniorCyclists*12.25;
				seniorFunds=seniorCyclists*13.75;
				totalFunds=(juniorFunds+seniorFunds)*0.95;
				System.out.printf("Total funds raised: %.2f", totalFunds);
				break;
				
			case "road":
				juniorFunds=juniorCyclists*20;
				seniorFunds=seniorCyclists*21.5;
				totalFunds=(juniorFunds+seniorFunds)*0.95;
				System.out.printf("Total funds raised: %.2f", totalFunds);
			break;
		}
	}
}
