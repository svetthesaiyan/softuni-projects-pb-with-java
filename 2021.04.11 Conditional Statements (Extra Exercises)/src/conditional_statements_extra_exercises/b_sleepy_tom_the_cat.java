package conditional_statements_extra_exercises;

import java.util.Scanner;

public class b_sleepy_tom_the_cat 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter how many days off you have in this calendar year: ");
		int daysOff=Integer.parseInt(scanner.nextLine());	// почивни дни в годината
		System.out.println();
		
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
			System.out.println("Tom will run away; you're annoying him!");
			System.out.println("You're playing with "+Math.abs(playtimePerYearHoursDifference)+" hours and "+Math.abs(playtimePerYearMinsDifference)+" minutes more than what Tom'd like! Give the poor cat a break, please, or he will escape and never be seen again...");
		}
		else if(playtimePerYearInMins<playtimeNormPerYearInMins)
		{
			System.out.println("Tom sleeps well because you know when to let him be.");
			System.out.println("You can play with Tom for "+Math.abs(playtimePerYearHoursDifference)+" hours and "+Math.abs(playtimePerYearMinsDifference)+" minutes extra if you'd like; he won't mind a little more affection.");
		}
	}
}
