package conditional_statement_exercise;

import java.util.Scanner;

public class b_bonus_points 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter contestant's starting points: ");
		int startingPoints=Integer.parseInt(scanner.nextLine());
		double bonusPoints=0.0;
		
		if(startingPoints<=100)
			bonusPoints=5;
		else if(startingPoints>100 && startingPoints<=1000)
			bonusPoints=startingPoints*0.2;
		else
			bonusPoints=startingPoints*0.1;
		
		if(startingPoints%2==0)	// ако числото е четно
			bonusPoints+=1;
		else if(startingPoints%5==0)	// ако числото завършва на 5
			bonusPoints+=2;

		System.out.println("You have "+bonusPoints+" bonus points.");
		System.out.println("You have a total of "+(startingPoints+bonusPoints)+" points.");
	}
}