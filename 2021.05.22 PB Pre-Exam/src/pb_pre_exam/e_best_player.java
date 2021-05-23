package pb_pre_exam;

import java.util.Scanner;

public class e_best_player 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String bestPlayer="";
		int max=Integer.MIN_VALUE;
		
		boolean hasScoredHatTrick=false;
		
		String input=scanner.nextLine();
		while(!input.equals("END"))
		{
			String playerName=input;
			int goals=Integer.parseInt(scanner.nextLine());
			if(goals>max)
			{
				bestPlayer=playerName;
				max=goals;
			}
			if(goals>=3)
				hasScoredHatTrick=true;
			if(goals>=10)
				break;
			
			input=scanner.nextLine();
		}
		System.out.println(bestPlayer+" is the best player!");
		
		if(hasScoredHatTrick)
			System.out.print("He has scored "+max+" goals and made a hat-trick !!!");
		else
			System.out.print("He has scored "+max+" goals.");
	}
}
