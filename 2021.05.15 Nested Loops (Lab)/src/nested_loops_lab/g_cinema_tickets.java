package nested_loops_lab;

import java.util.Scanner;

public class g_cinema_tickets 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int studentTicketCounter =0;
		int standardTicketCounter=0;
		int kidTicketCounter     =0;
		double totalTicketCounter=0;
		
		System.out.print("Enter the title of the movie you're going to watch: ");
		String movieTitle=scanner.nextLine();
		while(!movieTitle.equalsIgnoreCase("Finish")) 
		{
			double currentHallFillCounter=0;
			
			System.out.print("Enter the total amount of seats available in your theatre for \""+movieTitle+"\": ");
			int totalHallSeats=Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter the ticket type in accordance to each person's age."+"\n"+"You can choose from:"+"\n"+"• \"kid\""+"\n"+"• \"student\""+"\n"+"• \"standard\"");
			String ticketType=scanner.nextLine(); 
			while(!ticketType.equalsIgnoreCase("End"))
			{
				if(ticketType.equals("kid"))
					kidTicketCounter++;
				else if(ticketType.equals("student"))
					studentTicketCounter++;
				else if(ticketType.equals("standard"))
					standardTicketCounter++;
				
				currentHallFillCounter++;
				totalTicketCounter=studentTicketCounter+standardTicketCounter+kidTicketCounter;
				
				if(currentHallFillCounter>=totalHallSeats)
					break;
				
				System.out.print("Enter the subsequent ticket type: ");
				ticketType=scanner.nextLine();
			}
			System.out.printf("\n"+"The theatre for \"%s\" is %.2f%% full."+"\n", movieTitle, ((currentHallFillCounter/totalHallSeats)*100));
			
			System.out.print("\n"+"Enter the subsequent movie title: ");
			movieTitle=scanner.nextLine();
		}
		System.out.printf("\n"+"Total tickets purchased: %.0f"+"\n"					, totalTicketCounter);
		System.out.printf("Percentage of tickets with child discount: %.2f%%"+"\n"  , ((kidTicketCounter/totalTicketCounter)*100));
		System.out.printf("Percentage of tickets with student discount: %.2f%%"+"\n", ((studentTicketCounter/totalTicketCounter)*100));
		System.out.printf("Percentage of tickets with no discount: %.2f%%"			, ((standardTicketCounter/totalTicketCounter)*100));
	}
}
