package while_loop_exercise;

import java.util.Scanner;

public class f_cake 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the birthday cake: ");
		int cakeLength=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the width of the birthday cake: ");
		int cakeWidth=Integer.parseInt(scanner.nextLine());
		int cakeArea=cakeLength*cakeWidth;
		
		boolean isCakeEaten=false;

		System.out.println("Enter how many pieces of cake have been eaten. I'll interrupt you if you don't have any more cake left."+"\n"+"Write \"Stop\" when you've finished inputting the amount of pieces of cakes your guests will be consuming at the party.");
		String text=scanner.nextLine();
		while(!text.equalsIgnoreCase("Stop"))
		{
			int cakePiecesTaken=Integer.parseInt(text);
			cakeArea-=cakePiecesTaken;
			if(cakeArea<=0)
			{
				isCakeEaten=true;
				break;
			}
			
			text=scanner.nextLine();
		}
		
		System.out.println();
		if(isCakeEaten)
			System.out.printf("No more cake left! You need %d more piece(s) to feed the rest of your guests.", Math.abs(cakeArea));
		else
			System.out.printf("%d pieces of cake are left.", cakeArea);
	}
}
