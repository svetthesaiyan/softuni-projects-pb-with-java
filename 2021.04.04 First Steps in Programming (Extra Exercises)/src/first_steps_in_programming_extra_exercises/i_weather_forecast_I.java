package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class i_weather_forecast_I 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		
		if(input.equalsIgnoreCase("sunny"))
		{
			System.out.println("It's warm outside!");
		}
		else
			System.out.println("It's cold outside!");
	}
}
