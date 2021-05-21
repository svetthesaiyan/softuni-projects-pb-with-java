package pb_exam_1_2;

import java.util.Scanner;

public class d_darts 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String name=scanner.nextLine();
		
		int startingPoints=301;
		int successfulShotsCounter=0;
		int unsuccessfulShotsCounter=0;
		
		boolean hasWon=false;
		
		String input=scanner.nextLine();
		while(!input.equals("Retire"))
		{
			String area=input;
			int points=Integer.parseInt(scanner.nextLine());
			
			if(area.equals("Double"))
				points*=2;
			else if(area.equals("Triple"))
				points*=3;
			
			if(startingPoints-points<0)
			{
				unsuccessfulShotsCounter++;
				input=scanner.nextLine();
				continue;
			}
			
			successfulShotsCounter++;
			startingPoints-=points;
			if(startingPoints==0)
			{
				hasWon=true;
				System.out.printf("%s won the leg with %d shots.", name, successfulShotsCounter);
				break;
			}
			
			input=scanner.nextLine();
		}
		if(!hasWon)
			System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShotsCounter);
	}
}
