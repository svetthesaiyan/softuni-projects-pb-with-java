package conditional_statements_extra_exercises;

import java.util.Scanner;

public class b_sleepy_tom_the_cat 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int daysOff=Integer.parseInt(scanner.nextLine());	// почивни дни в годината
		int playtimeNormPerYearInMins=30000;
		int playtimeWorkDaysPerDayinMins=63;
		int playtimeDaysOffPerDayInMins=127;
		int daysPerYear=365;	
		
		int workDays=daysPerYear-daysOff;	// работни дни в годината
		int playtimePerYearInMins=(workDays*playtimeWorkDaysPerDayinMins)+(daysOff*playtimeDaysOffPerDayInMins);
		
		int playtimePerYearNormDifference=playtimeNormPerYearInMins-playtimePerYearInMins;
		
		int playtimePerYearHoursDifference=playtimePerYearNormDifference/60;
		int playtimePerYearMinsDifference=playtimePerYearNormDifference%60;
		
		if(playtimePerYearInMins>playtimeNormPerYearInMins)
		{
			System.out.println("Tom will run away");
			System.out.println(Math.abs(playtimePerYearHoursDifference)+" hours and "+Math.abs(playtimePerYearMinsDifference)+" minutes more for play");
		}
		else if(playtimePerYearInMins<playtimeNormPerYearInMins)
		{
			System.out.println("Tom sleeps well");
			System.out.println(Math.abs(playtimePerYearHoursDifference)+" hours and "+Math.abs(playtimePerYearMinsDifference)+" minutes less for play");
		}
	}
}
