package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class g_school_camp
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose whether the season in which you'll be going on a trip is either \"Spring\", \"Summer\", \"Autumn\" or \"Winter\": ");
		String season=scanner.nextLine();
		System.out.print("Choose whether the gender of the group is either \"boys\', \"girls\" or \"mixed\": ");
		String groupGender=scanner.nextLine();
		System.out.print("Enter the amount of students going on camp: ");
		int studentCount=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of nights the students will be staying at said camp: ");
		int nightsStayed=Integer.parseInt(scanner.nextLine());
		System.out.println("");
		
		double nightsPrice=nightsStayed*studentCount;
		String sport="";
		
		switch(season)
		{
			case "Winter":
				if(groupGender.equals("boys")) 
				{
					nightsPrice*=9.6;
					sport="Judo";
				}
				else if(groupGender.equals("girls"))
				{
					nightsPrice*=9.6;
					sport="Gymnastics";
				}
				else if(groupGender.equals("mixed"))
				{
					nightsPrice*=10;
					sport="Ski";
				}
				break;
				
			case "Spring":
				if(groupGender.equals("boys"))
				{
					nightsPrice*=7.2;
					sport="Tennis";
				}
				else if (groupGender.equals("girls"))
				{
					nightsPrice*=7.2;
					sport="Athletics";
				}
				else if(groupGender.equals("mixed"))
				{
					nightsPrice*=9.5;
					sport="Cycling";
				}
				break;
				
			case "Summer":
				if(groupGender.equals("boys"))
				{
					nightsPrice*=15;
					sport="Football";
				}
				else if(groupGender.equals("girls"))
				{
					nightsPrice*=15;
					sport="Volleyball";
				}
				else if(groupGender.equals("mixed"))
				{
					nightsPrice*=20;
					sport="Swimming";
				}
				break;
		}
		
		if(studentCount>=50)
			nightsPrice*=0.5;
		else if(studentCount>=20 && studentCount<50)
			nightsPrice*=0.85;
		else if(studentCount>=10 && studentCount<20)
			nightsPrice*=0.95;
		
		System.out.printf("Your \"%s\" group will be practising %s during their stay at the camp."+"\n"+"The total price will be: %.2f lv.", groupGender, sport, nightsPrice);
	}
}