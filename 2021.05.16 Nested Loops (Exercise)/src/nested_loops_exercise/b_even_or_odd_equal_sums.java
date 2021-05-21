package nested_loops_exercise;

import java.util.Scanner;

public class b_even_or_odd_equal_sums 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter initial 6-digit number: ");
		int initialNumber=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter final 6-digit number: ");
		int finalNumber=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		
		for(int i=initialNumber; i<=finalNumber; i++)
		{
			int oddSum=0;
			int evenSum=0;
			
			String currentNum=""+i; // това е числото, чиито позиции проверяваме в долния цикъл с помощта на командата 'charAt'
			for(int j=0; j<6; j++)
			{
				int currentDigit=Integer.parseInt(""+currentNum.charAt(j));
				
				if(j%2==0)
					evenSum+=currentDigit;
				else
					oddSum+=currentDigit;
			}
			if(oddSum==evenSum)
				System.out.print(i+" ");
		}
		System.out.print("\n"+"The numbers above contain evenly and oddly placed digits whose sums are all equal.");
	}
}
