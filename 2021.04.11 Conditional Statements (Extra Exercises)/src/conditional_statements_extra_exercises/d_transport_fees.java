package conditional_statements_extra_exercises;

import java.util.Scanner;

public class d_transport_fees
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the distance of your trip in kilometres: ");
		int kilometres=Integer.parseInt(scanner.nextLine());
		System.out.print("At what time of the day will you be travelling?"+"\n"+"Please select from \"day\" and \"night\": ");
		String timeOfDay=scanner.nextLine();
		System.out.println();
		
		double taxiPriceDayPerKilometre=0.79;
		double taxiPriceNightPerKilometre=0.9;
		double busPriceDayAndNightPerKilometre=0.09;
		double trainPriceDayAndNightPerKilometre=0.06;
		
		final int kilometresMinimumBus=20;
		final int kilometresMinimumTrain=100;
		
		double taxiDaySum=(taxiPriceDayPerKilometre*kilometres)+0.7;
		double taxiNightSum=(taxiPriceNightPerKilometre*kilometres)+0.7;
		double busSum=busPriceDayAndNightPerKilometre*kilometres;
		double trainSum=trainPriceDayAndNightPerKilometre*kilometres;
		
		if(kilometres<=kilometresMinimumBus)
		{
			if(timeOfDay.equalsIgnoreCase("day"))
			System.out.printf("The cheapest option would be to call a taxi. It'll cost you %.2f leva.", taxiDaySum);
			else if(timeOfDay.equalsIgnoreCase("night"))
				System.out.printf("The cheapest option would be to call a taxi. It'll cost you %.2f leva.", taxiNightSum);
		}
		
		else if(kilometres>kilometresMinimumBus && kilometres<=kilometresMinimumTrain)
			System.out.printf("The cheapest option would be to catch a bus. It'll cost you %.2f leva.", busSum);
		
		else if(kilometres>=kilometresMinimumTrain)
			System.out.printf("The cheapest option would be to go by train. It'll cost you %.2f leva.", trainSum);
	}
}
