package for_loop_lab;

import java.util.Scanner;

public class h_number_sequence 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers you'd like to work with: ");
		int numberAmount=Integer.parseInt(scanner.nextLine());
		int max=Integer.MIN_VALUE;	// най-малката възможна стойност, която можем да съхраним
		int min=Integer.MAX_VALUE;	// най-голямата възможна стойност, която можем да съхраним
		
		if(numberAmount==1)
			System.out.println("You only input a single number and as a result you have neither a maximal, nor a minimal number!");
		
		else if(numberAmount>=2)
		{
		for(int i=1; i<=numberAmount; i++)
		{
			System.out.print("Enter number "+i+": ");
			int value=Integer.parseInt(scanner.nextLine());
			
			if(value>max)
				max=value;
			if(value<min)
				min=value;
		}
		System.out.println();
		System.out.println("The maximal number among those you input is: "+max+", whereas the minimal is: "+min);
		}
	}
}
