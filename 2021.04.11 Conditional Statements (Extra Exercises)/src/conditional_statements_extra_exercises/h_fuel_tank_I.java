package conditional_statements_extra_exercises;

import java.util.Scanner;

public class h_fuel_tank_I 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the type of fuel your car runs on."+"\n"+"You can pick from \"diesel\", \"gasoline\" and \"gas\": ");
		String fuelType=scanner.nextLine();
		String fuelTypeName=fuelType.equalsIgnoreCase("diesel") ? "diesel"	// "fuelType" е това, което сме записали в 1вите кавички, които се намират в скобите, а "fuelTypeName" е това, което сме записали във 2рите кавички
				:fuelType.equalsIgnoreCase("gasoline") ? "gasoline"
						:fuelType.equalsIgnoreCase("gas") ? "gas"
								:"";
		
		System.out.print("Please enter how much fuel you have currently in your reservior in litres: ");
		double fuelLitres=Double.parseDouble(scanner.nextLine());
		System.out.println();
		
		if(fuelLitres>=25 && (fuelType.equalsIgnoreCase("Diesel") || fuelType.equalsIgnoreCase("Gasoline") || fuelType.equalsIgnoreCase("Gas")))
			System.out.println("You have enough "+fuelTypeName+". You needn't worry about your fuel.");
		else if(fuelLitres<25 && (fuelType.equalsIgnoreCase("Diesel") || fuelType.equalsIgnoreCase("Gasoline") || fuelType.equalsIgnoreCase("Gas")))
			System.out.println("You're running low on fuel! Fill your tank with some "+fuelTypeName+" as soon as you can!");
		else
			System.out.println("Invalid fuel!");
	}
}
