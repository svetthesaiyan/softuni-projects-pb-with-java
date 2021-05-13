package for_loop_extra_exercises;

import java.util.Scanner;

public class g_football_league 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the capacity of the stadium: ");
		double stadiumCapacity=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of fans attending the game: ");
		double fans=Integer.parseInt(scanner.nextLine());
		
		double standAFans=0;
		double standBFans=0;
		double standCFans=0;
		double standDFans=0;
		
		for(int i=1; i<=fans; i++)
		{
			System.out.print("Enter the stand in which fan №"+i+" is situated: ");
			char stand=scanner.next().charAt(0);
			
			switch(stand)
			{
				case 'A':
					standAFans++;
					break;
				case 'B':
					standBFans++;
					break;
				case 'C':
					standCFans++;
					break;
				case 'D': // default:
					standDFans++;
					break;
			}
		}
		
		System.out.println();
		double stadiumFillCapacity=(fans/stadiumCapacity)*100;
		
		double standAFillCapacity=(standAFans/fans)*100;
		double standBFillCapacity=(standBFans/fans)*100;
		double standCFillCapacity=(standCFans/fans)*100;
		double standDFillCapacity=(standDFans/fans)*100;
		
		System.out.printf("The percentage of fans accommodated in stand 'A' is %.2f%%"+"\n", standAFillCapacity);
		System.out.printf("The percentage of fans accommodated in stand 'B' is %.2f%%"+"\n", standBFillCapacity);
		System.out.printf("The percentage of fans accommodated in stand 'C' is %.2f%%"+"\n", standCFillCapacity);
		System.out.printf("The percentage of fans accommodated in stand 'D' is %.2f%%"+"\n", standDFillCapacity);
		System.out.printf("The stadium fill percentage is %.2f%%", stadiumFillCapacity);
	}
}
