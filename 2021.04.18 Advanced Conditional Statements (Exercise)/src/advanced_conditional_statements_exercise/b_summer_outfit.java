package advanced_conditional_statements_exercise;

import java.util.Scanner;

public class b_summer_outfit 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter what the weather is like in degrees celsius: ");
		int degrees=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the time of day when you plan to go out on a walk.");
		System.out.println("You can pick from: \"Morning\", \"Afternoon\" and \"Evening\".");
		String timeOfDay=scanner.nextLine();
		System.out.println();
		
		// празни String-ове
		String outfit="";
		String shoes="";
		
		switch(timeOfDay)
		{
			case "Morning":
			if(degrees>=10 && degrees<=18)
			{
				outfit="Sweatshirt";
				shoes="Sneakers";
			}
			else if(degrees>18 && degrees<=24)
			{
				outfit="Shirt";
				shoes="Moccasins";
			}
			else if(degrees>=25)
			{
				outfit="T-Shirt";
				shoes="Sandals";
			}
			break;
			
			case "Afternoon":
			if(degrees>=10 && degrees<=18)
			{
				outfit="Shirt";
				shoes="Moccasins";
			}
			else if(degrees>18 && degrees<=24)
			{
				outfit="T-Shirt";
				shoes="Sandals";
			}
			else if(degrees>=25)
			{
				outfit="Swim Suit";
				shoes="Barefoot";
			}
			break;
			
			case "Evening":
				outfit="Shirt";
				shoes="Moccasins";
			break;
		}
		System.out.println("It's "+degrees+" degrees outside, so get your "+outfit+" and "+shoes+".");
	}
}
