package pb_exam_1_1;

import java.util.Scanner;

public class e_tennis_ranklist 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double tournamentsParticipated=Integer.parseInt(scanner.nextLine());
		int startingPoints=Integer.parseInt(scanner.nextLine());
		
		double points=0;
		int tournamentsWonCounter=0;
		
		for(int tournamentCounter=0; tournamentCounter<tournamentsParticipated; tournamentCounter++)
		{
			
			String tournamentPlacing=scanner.nextLine();
			if(tournamentPlacing.equals("W"))
			{
				points+=2000;
				tournamentsWonCounter++;
			}
			else if(tournamentPlacing.equals("F"))
			{
				points+=1200;
			}
			else if(tournamentPlacing.equals("SF"))
			{
				points+=720;
			}
		}
		System.out.printf("Final points: %.0f"+"\n", (startingPoints+points));
		System.out.printf("Average points: %.0f"+"\n", Math.floor(points/tournamentsParticipated));
		System.out.printf("%.2f%%", (tournamentsWonCounter/tournamentsParticipated)*100);
	}
}
