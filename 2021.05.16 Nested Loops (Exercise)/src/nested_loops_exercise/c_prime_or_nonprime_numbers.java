package nested_loops_exercise;

import java.util.Scanner;

public class c_prime_or_nonprime_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int sumPrime=0;
		int sumNonPrime=0;
		
		System.out.print("Enter a number: ");
		String input=scanner.nextLine();
		while(!input.equalsIgnoreCase("Stop"))
		{
			boolean isPrime=true;
			
			int num=Integer.parseInt(input);
			if(num<0)
				System.out.println("Number is negative.");
			else
			{
				for(int i=2; i<num; i++) // първото просто число е '2'
				{
					if(num%i==0) // проверка за неестествени числа 
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
					sumPrime+=num;
				else
					sumNonPrime+=num;
			}
			
			System.out.print("Enter another number: ");
			input=scanner.nextLine();
		}
		System.out.print("\n"+"Sum of all prime numbers is: "+sumPrime+"\n"+"Sum of all non prime numbers is: "+sumNonPrime);
	}
}
