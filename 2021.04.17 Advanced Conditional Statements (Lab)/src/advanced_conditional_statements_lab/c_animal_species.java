package advanced_conditional_statements_lab;

import java.util.Scanner;

public class c_animal_species 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an animal."+"\n"+"You can choose from \"dog\", \"crocodile\", \"tortoise\" or \"snake\": ");
		String animal=scanner.nextLine();
		switch(animal)
		{
		case "dog":
				System.out.println("That animal's a mammal.");
				break;
		case "crocodile":
		case "tortoise":
		case "snake":
			System.out.println("You chose a slippery reptile...");
			break;
		default:
			System.out.println("Your reading comprehension skills are beyond abysmal.");
		}
	}
}
