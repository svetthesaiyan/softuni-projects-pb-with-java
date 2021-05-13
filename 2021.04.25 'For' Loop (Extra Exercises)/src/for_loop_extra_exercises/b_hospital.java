package for_loop_extra_exercises;

import java.util.Scanner;

public class b_hospital 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of days you'll be treating patients: ");
		int timeframe=Integer.parseInt(scanner.nextLine());
		int doctors=7;
		
		int patientsTreated=0;
		int patientsUntreated=0;
		
		for(int currentDay=1; currentDay<=timeframe; currentDay++)
		{
			System.out.print("Enter the amount of patients that require attention on day "+currentDay+": ");
			int patients=Integer.parseInt(scanner.nextLine());
			
			if(currentDay%3==0)
			{
				if(patientsUntreated>patientsTreated)
					doctors++;
			}
			
			if(patients<=doctors)
				patientsTreated+=patients;
			else
			{
				patientsTreated+=doctors;
				patientsUntreated+=patients-doctors;
			}
		}
		
		System.out.println();
		System.out.print("Treated patients: "+patientsTreated+"\n"+"Untreated patients: "+patientsUntreated);
	}
}
