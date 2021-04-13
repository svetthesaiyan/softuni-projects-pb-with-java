package first_steps_in_programming_exercises;

import java.util.Scanner;

public class d_books_to_read 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the amount of pages you have to read in total: ");
		int pages_total=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many pages per day you're willing to read: ");
		int pages_can_read=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many days you have to read whatever it is you have to read: ");
		int days_to_read=Integer.parseInt(scanner.nextLine());
		
		int time_to_read=pages_total/pages_can_read;
		int hours_per_day=time_to_read/days_to_read;
		
		System.out.println();
		System.out.println("You must spend at least "+hours_per_day+" hour(s) per day reading in order to finish your book on time.");	
	}
}
