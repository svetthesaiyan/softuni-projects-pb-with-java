package pb_exam_1_1;

import java.util.Scanner;

public class d_number_wars_card_game 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String playerOneName=scanner.nextLine();
		String playerTwoName=scanner.nextLine();
		
		int playerOnePoints=0;
		int playerTwoPoints=0;
		
		boolean isWar=false;
		
		String input=scanner.nextLine();
		while(!input.equals("End of game"))
		{
			int playerOneCard=Integer.parseInt(input);
			int playerTwoCard=Integer.parseInt(scanner.nextLine());
			
			if(playerOneCard>playerTwoCard)
				playerOnePoints+=playerOneCard-playerTwoCard;
			else if(playerOneCard<playerTwoCard)
				playerTwoPoints+=playerTwoCard-playerOneCard;
			else if(playerOneCard==playerTwoCard)
			{
				isWar=true;
				System.out.println("Number wars!");
				int playerOneCardWar=Integer.parseInt(scanner.nextLine());
				int playerTwoCardWar=Integer.parseInt(scanner.nextLine());
				
				if(playerOneCardWar>playerTwoCardWar)
					System.out.print(playerOneName+" is winner with "+playerOnePoints+" points");
				else if(playerOneCardWar<playerTwoCardWar)
					System.out.print(playerTwoName+" is winner with "+playerTwoPoints+" points");
				break;
			}
			input=scanner.nextLine();
		}
		
		if(!isWar)
		{
			System.out.println(playerOneName+" has "+playerOnePoints+" points");
			System.out.println(playerTwoName+" has "+playerTwoPoints+" points");
		}
	}
}
