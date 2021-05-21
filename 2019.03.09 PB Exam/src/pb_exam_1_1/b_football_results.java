package pb_exam_1_1;

import java.util.Scanner;

public class b_football_results 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String firstGameResult=scanner.nextLine();
		String secondGameResult=scanner.nextLine();
		String thirdGameResult=scanner.nextLine();
		
		int gamesWonCounter=0;
		int gamesLostCounter=0;
		int gamesDrawnCounter=0;
		
		int firstGameLeftGoals=firstGameResult.charAt(0);
		int firstGameRightGoals=firstGameResult.charAt(2);
		if(firstGameLeftGoals>firstGameRightGoals)
			gamesWonCounter++;
		else if(firstGameLeftGoals==firstGameRightGoals)
			gamesDrawnCounter++;
		else
			gamesLostCounter++;
		
		int secondGameLeftGoals=secondGameResult.charAt(0);
		int secondGameRightGoals=secondGameResult.charAt(2);
		if(secondGameLeftGoals>secondGameRightGoals)
			gamesWonCounter++;
		else if(secondGameLeftGoals==secondGameRightGoals)
			gamesDrawnCounter++;
		else
			gamesLostCounter++;
		
		int thirdGameLeftGoals=thirdGameResult.charAt(0);
		int thirdGameRightGoals=thirdGameResult.charAt(2);
		if(thirdGameLeftGoals>thirdGameRightGoals)
			gamesWonCounter++;
		else if(thirdGameLeftGoals==thirdGameRightGoals)
			gamesDrawnCounter++;
		else
			gamesLostCounter++;
		
		System.out.println("Team won "+gamesWonCounter+" games.");
		System.out.println("Team lost "+gamesLostCounter+" games.");
		System.out.println("Drawn games: "+gamesDrawnCounter);
	}
}
