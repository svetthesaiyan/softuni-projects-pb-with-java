package for_loop_exercise;

import java.util.Scanner;

public class d_histogram 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many numbers you'd like to work with: ");
		int maxNumber=Integer.parseInt(scanner.nextLine());
		
		double percent1=0;
		double percent2=0;
		double percent3=0;
		double percent4=0;
		double percent5=0;
		
		for(int i=1; i<=maxNumber; i++)
		{
			System.out.print("Enter "+i+" number: ");
			int number=Integer.parseInt(scanner.nextLine());
			
			if(number<200)
				percent1++;
			else if(number>=200 && number<399)
				percent2++;
			else if(number>=400 && number<=599)
				percent3++;
			else if(number>=600 && number<=799)
				percent4++;
			else if(number>=800)
				percent5++;
		}
		System.out.println();
		System.out.printf("%.2f%% of the number(s) you input belong in the 1st bracket."+"\n", percent1/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input belong in the 2nd bracket."+"\n", percent2/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input belong in the 3rd bracket."+"\n", percent3/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input belong in the 4th bracket."+"\n", percent4/maxNumber*100);
		System.out.printf("%.2f%% of the number(s) you input belong in the 5th bracket."+"\n", percent5/maxNumber*100);
	}
}
