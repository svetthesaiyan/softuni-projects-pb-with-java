package conditional_statements_extra_exercises;

import java.util.Scanner;

public class c_harvest 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the vineyard's area in squared metres: ");
		int vineyardArea=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many kilograms of grapes a single squared metre of land possesses: ");
		double grapesPerSquaredMetre=Double.parseDouble(scanner.nextLine());
		System.out.print("Please enter how much wine has to be made in litres: ");
		int wineInLitres=Integer.parseInt(scanner.nextLine());
		System.out.print("Please specify how many farmers are working together to make the wine: ");
		int farmersQuantity=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		double grapesInKilos=vineyardArea*grapesPerSquaredMetre;
		double wineForSale=grapesInKilos/2.5*0.4;	// махаме 40%, тъй като по условие само толкова от гроздето се използва за производството на вино
		double wineProductionLeftover=Math.abs(wineInLitres-wineForSale);
		
		if(wineForSale<wineInLitres)
		{
			System.out.printf("It will be a tough winter! %.0f litres more of wine are needed for the farmers to make a profit.", Math.floor(wineProductionLeftover));
		}
		else
		{
			double winePerFarmer=wineProductionLeftover/farmersQuantity;
			System.out.printf("Good harvest this year! Total wine made: %.0f litres.", Math.floor(wineForSale));
			System.out.println();
			System.out.printf("We'll have %.0f litres leftover so that roughly equates to %.0f litres being shared per farmer. LET'S GET FUCKED UP, LADS!", Math.ceil(wineProductionLeftover), Math.ceil(winePerFarmer));
		}
	}
}
