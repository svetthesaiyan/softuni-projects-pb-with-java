package conditional_statements_extra_exercises;

import java.util.Scanner;

public class c_harvest 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int vineyardArea=Integer.parseInt(scanner.nextLine());
		double grapesPerSquaredMetre=Double.parseDouble(scanner.nextLine());
		int wineInLitres=Integer.parseInt(scanner.nextLine());
		int farmersQuantity=Integer.parseInt(scanner.nextLine());
		
		double grapesInKilos=vineyardArea*grapesPerSquaredMetre;
		double wineForSale=grapesInKilos/2.5*0.4;	// махаме 40%, тъй като по условие толкова от гроздето се използва за вино
		double wineProductionLeftover=Math.abs(wineInLitres-wineForSale);
		
		if(wineForSale<wineInLitres)
		{
			System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineProductionLeftover));
		}
		else
		{
			double winePerFarmer=wineProductionLeftover/farmersQuantity;
			System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wineForSale));
			System.out.println();
			System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineProductionLeftover), Math.ceil(winePerFarmer));
		}
	}
}
