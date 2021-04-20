package advanced_conditional_statements_lab;

import java.util.Scanner;

public class a_weekday 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number from 1 to 7, which will consequently get turned into the corresponding day of the week: ");
		int number=Integer.parseInt(scanner.nextLine());
		switch(number)
		{
		case 1: System.out.println("You chose Monday!");
			break;
		case 2: System.out.println("You chose Tuesday!");
			break;
		case 3: System.out.println("You chose Wednesday!");
			break;
		case 4: System.out.println("You chose Thursday!");
			break;
		case 5: System.out.println("You chose Friday!");
			break;
		case 6: System.out.println("You chose Saturday!");
			break;
		case 7: System.out.println("You chose Sunday!");
			break;
			
		default: System.out.println("Bro, can you seriously not count from 1 to 7?");
		}
	}
}
