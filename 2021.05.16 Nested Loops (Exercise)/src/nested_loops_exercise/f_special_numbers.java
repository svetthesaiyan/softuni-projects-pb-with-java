package nested_loops_exercise;

import java.util.Scanner;

public class f_special_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number with which I'll summon a bunch of numbers later on: ");
		int number=Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<10; i++) // първа цифра
		{
			for(int j=1; j<10; j++) // втора цифра
			{
				for(int k=1; k<10; k++) // трета цифра
				{
					for(int l=1; l<10; l++) // четвърта цифра
					{
						if(number%i==0 && number%j==0 && number%k==0 && number%l==0)
							 System.out.printf("%d%d%d%d ", i, j, k, l);
					}
				}
			}
		}
		
		System.out.print("\n"+"\n"+"All of the above numbers' digits when they are divided by "+number+" leave no remainders!");	
	}
}
