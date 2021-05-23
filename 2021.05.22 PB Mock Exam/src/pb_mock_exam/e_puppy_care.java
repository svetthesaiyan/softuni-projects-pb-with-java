package pb_mock_exam;

import java.util.Scanner;

public class e_puppy_care 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int petFoodAmount=Integer.parseInt(scanner.nextLine())*1000; // in kilograms
		
		int petFoodTotal=0;
		
		String input=scanner.nextLine();
		while(!input.equals("Adopted"))
		{
			int petFoodPerServing=Integer.parseInt(input); // in grams
			petFoodTotal+=petFoodPerServing;
			input=scanner.nextLine();
		}
		if(petFoodAmount>=petFoodTotal)
			System.out.printf("Food is enough! Leftovers: %d grams.", (petFoodAmount-petFoodTotal));
		else
			System.out.printf("Food is not enough. You need %d grams more.", (petFoodTotal-petFoodAmount));
	}
}
