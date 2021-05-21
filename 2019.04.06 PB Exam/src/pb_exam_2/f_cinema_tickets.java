package pb_exam_2;

import java.util.Scanner;

public class f_cinema_tickets 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int studentTicketCounter=0;
		int standardTicketCounter=0;
		int kidTicketCounter=0;
		double totalTicketCounter=0;
		
		String filmName=scanner.nextLine();
		while(!filmName.equals("Finish"))
		{
			double currentSpaces=0;
			int emptySpaces=Integer.parseInt(scanner.nextLine());
			
			String ticketType=scanner.nextLine();
			while(!ticketType.equals("End"))
			{
				if(ticketType.equals("student"))
					studentTicketCounter++;
				else if(ticketType.equals("standard"))
					standardTicketCounter++;
				else if(ticketType.equals("kid"))
					kidTicketCounter++;
				
				totalTicketCounter=studentTicketCounter+standardTicketCounter+kidTicketCounter;

				currentSpaces++;
				if(emptySpaces<=currentSpaces)
					break;
				
				ticketType=scanner.nextLine();
			}
			System.out.printf("%s - %.2f%% full.%n", filmName, (currentSpaces/emptySpaces)*100);
			
			filmName=scanner.nextLine();
		}
		System.out.printf("Total tickets: %.0f%n", totalTicketCounter);
		System.out.printf("%.2f%% student tickets.%n", (studentTicketCounter/totalTicketCounter)*100);
		System.out.printf("%.2f%% standard tickets.%n", (standardTicketCounter/totalTicketCounter)*100);
		System.out.printf("%.2f%% kids tickets.", (kidTicketCounter/totalTicketCounter)*100);
	}
}
