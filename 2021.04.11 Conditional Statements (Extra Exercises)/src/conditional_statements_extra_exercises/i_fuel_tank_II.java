package conditional_statements_extra_exercises;

import java.util.Scanner;

public class i_fuel_tank_II 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the type of fuel your car runs on."+"\n"+"You can pick from \"diesel\", \"gasoline\" and \"gas\": ");
		String fuelType=scanner.nextLine();
		System.out.print("Please enter how much fuel you'd like to stock up on in litres: ");
		double fillLitres=Double.parseDouble(scanner.nextLine());
		System.out.print("Do you have a club card?"+"\n"+"If you do, then type \"yes\" but if you don't then type \"no\": ");
		String clubCard=scanner.nextLine();
		System.out.println();
		
		// без клубна карта
        double gasolineSum = 2.22 * fillLitres;
        double dieselSum = 2.33 * fillLitres;
        double gasSum = 0.93 * fillLitres;
 
        // с клубна карта
        double gasolineSumClubCard = 2.04 * fillLitres;
        double dieselSumClubCard = 2.21 * fillLitres;
        double gasSumClubCard = 0.85 * fillLitres;
		
		if(fillLitres>20 && fillLitres<=25)	// отстъпката е 8% => 92% от оригиналната стойност
		{
			 if (clubCard.equalsIgnoreCase("Yes")) 
			 {
	                if (fuelType.equalsIgnoreCase("Gasoline"))
	                    gasolineSumClubCard *= 0.92;
	                else if (fuelType.equalsIgnoreCase("Diesel"))
	                    dieselSumClubCard *= 0.92;
	                else if (fuelType.equalsIgnoreCase("Gas"))
	                    gasSumClubCard *= 0.92;
	         } 
			 else if (clubCard.equalsIgnoreCase("No")) 
			 {
	                if (fuelType.equalsIgnoreCase("Gasoline"))
	                    gasolineSum *= 0.92;
	                else if (fuelType.equalsIgnoreCase("Diesel"))
	                    dieselSum *= 0.92;
	                else if (fuelType.equalsIgnoreCase("Gas"))
	                    gasSum *= 0.92;
	         }
		}
		
		else if(fillLitres>25)	// отстъпката е 10% => 90% от оригиналната стойност
		{
			 if (clubCard.equalsIgnoreCase("Yes")) 
			 {
                 if (fuelType.equalsIgnoreCase("Gasoline"))
                     gasolineSumClubCard *= 0.9;
                 else if (fuelType.equalsIgnoreCase("Diesel"))
                     dieselSumClubCard *= 0.9;
                 else if (fuelType.equalsIgnoreCase("Gas"))
                     gasSumClubCard -= gasSumClubCard * 0.1; // moje i taka :D
             } 
			 else if (clubCard.equalsIgnoreCase("No")) 
			 {
				 if (fuelType.equalsIgnoreCase("Gasoline"))
                     gasolineSum *= 0.9;
				 else if (fuelType.equalsIgnoreCase("Diesel"))
                     dieselSum *= 0.9;
				 else if (fuelType.equalsIgnoreCase("Gas"))
                     gasSum *= 0.9;
			 }
		 }
		
		// извеждаме горните 2 главни условни конструкции, като в "else if"-a автоматично се включват и сумите, ако няма никаква отстъпка на горивото, тъй като формулите за тяхното намиране са вече упоменати в самото начало и не променяме нищо
		// реално, ако трябваше да сложим последна трета условна конструкция, тя би изглеждала така: "if(fillLitres<20)", но това би било объркало принтирането
		if (clubCard.equalsIgnoreCase("Yes")) 
		{
			 if (fuelType.equalsIgnoreCase("Gasoline"))
			 	System.out.printf("You need to pay %.2f lv. for the fuel, which, thanks to your club card, is discounted from %.2f lv.", gasolineSumClubCard, gasolineSum);
	         else if (fuelType.equalsIgnoreCase("Diesel"))
	             System.out.printf("You need to pay %.2f lv. for the fuel, which, thanks to your club card, is discounted from %.2f lv.", dieselSumClubCard, dieselSum);
	         else if (fuelType.equalsIgnoreCase("Gas"))
	             System.out.printf("You need to pay %.2f lv. for the fuel, which, thanks to your club card, is discounted from %.2f lv.", gasSumClubCard, gasSum);
	     } 
		 else if (clubCard.equalsIgnoreCase("No")) 
		 {
	         if (fuelType.equalsIgnoreCase("Gasoline"))
	             System.out.printf("You need to pay %.2f lv. for the fuel.", gasolineSum);
	         else if (fuelType.equalsIgnoreCase("Diesel"))
	             System.out.printf("You need to pay %.2f lv. for the fuel.", dieselSum);
	         else if (fuelType.equalsIgnoreCase("Gas"))
	             System.out.printf("You need to pay %.2f lv. for the fuel.", gasSum);
		 }
	}
}
