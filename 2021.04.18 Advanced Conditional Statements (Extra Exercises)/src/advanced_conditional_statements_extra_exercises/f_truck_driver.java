package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class f_truck_driver 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose whether the season in which you'll be driving is either \"Spring\", \"Summer\", \"Autumn\" or \"Winter\": ");
		String season=scanner.nextLine();
		System.out.print("Enter how many kilometres per month you drive: ");
		double km=Double.parseDouble(scanner.nextLine());
		
		double moneyPerKm=0;
		
		switch(season)
		{
			case "Spring":
			case "Autumn":
				if(km<5000)
					moneyPerKm=0.75;
				
				else if(km>5000 && km<=10_000)
					moneyPerKm=0.95;
				break;
				
			case "Summer":
				if(km<5000)
					moneyPerKm=0.9;
				
				else if(km>5000 && km<=10_000)
					moneyPerKm=1.1;
				break;
				
			case "Winter":
				if(km<5000)
					moneyPerKm=1.05;
				
				else if(km>5000 && km<=10_000)
					moneyPerKm=1.25;
				break;
		}
		
		if((season.equals("Spring") || season.equals("Summer") || season.equals("Autumn") || season.equals("Winter")) && (km>10_000 && km<=20_000))
			moneyPerKm=1.45;
		
		System.out.printf("Your salary is %.2f lv.", ((km*moneyPerKm*4)*0.9));
	}
}
