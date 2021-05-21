package nested_loops_lab;

import java.util.Scanner;

public class d_sum_of_two_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the starting value for the numeric interval: ");
		int startNumber=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the closing value for the numeric interval: ");
		int endNumber=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the magic number you're trying to conceive: ");
		int magicNumber=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		int loopCounter=0;
		
		boolean isFound=false;
		
		for(int number1=startNumber; number1<=endNumber; number1++)
		{
			for(int number2=startNumber; number2<=endNumber; number2++)
			{
				loopCounter++;
				
				if(number1+number2==magicNumber)
				{
					isFound=true;
					System.out.printf("It took our computer %d attempts to find the earliest set of numbers which when summated equal %d."+"\n"+"That being %d+%d=%d", loopCounter, magicNumber, number1, number2, magicNumber);
					break;
				}
			 }
				if(isFound) // прекратяваме главния цикъл, щом сме намерили числото, което търсим във вложения 'for'
					break;
		}
		
		if(!isFound)
			System.out.printf("%d combinations were computed but neither of their sums equal %d.", loopCounter, magicNumber);
	}
}
