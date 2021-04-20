package advanced_conditional_statements_lab;

import java.util.Scanner;

public class h_cinema_ticket
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day you're planning to watch a movie at our cinema: ");
		String day=scanner.nextLine();
		System.out.println();
		
		int ticketPrice=0;
		
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday"))
			ticketPrice=12;
		else if(day.equals("Wednesday") || day.equals("Thursday"))
			ticketPrice=14;
		else if(day.equals("Saturday") || day.equals("Sunday"))
			ticketPrice=16;
		
		System.out.println("The tickets cost "+ticketPrice+" lv. on the day you're planning to visit us.");
	}
}
