package pb_exam_1_2;

import java.util.Scanner;

public class f_basketball_tournament 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		double gamesWonCounter=0;
		double gamesLostCounter=0;
		double gamesPlayedCounter=0;
		
		String tournamentName=scanner.nextLine();
		while(!tournamentName.equals("End of tournaments"))
		{
			int gamesPlayed=Integer.parseInt(scanner.nextLine());
			for(int i=1; i<=gamesPlayed; i++)
			{
				int desiPoints=Integer.parseInt(scanner.nextLine());
				int opponentPoints=Integer.parseInt(scanner.nextLine());
				
				if(desiPoints>opponentPoints)
				{
					gamesWonCounter++;
					System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, (desiPoints-opponentPoints));
				}
				else if(desiPoints<opponentPoints)
				{
					gamesLostCounter++;
					System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, Math.abs(desiPoints-opponentPoints));
				}
				gamesPlayedCounter++;
			}
			tournamentName=scanner.nextLine();
		}
		System.out.printf("%.2f%% matches win%n", (gamesWonCounter/gamesPlayedCounter)*100);
		System.out.printf("%.2f%% matches lost", (gamesLostCounter/gamesPlayedCounter)*100);
	}
}
