package pb_pre_exam;

import java.util.Scanner;

public class d_grandpa_stavri 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int days=Integer.parseInt(scanner.nextLine());
		
		double whiskeyLitresTotal=0;
		double degreesTotal=0;
		double degreesAverage=0;
		
		for(int dayCounter=1; dayCounter<=days; dayCounter++)
		{
			double whiskeyLitres=Double.parseDouble(scanner.nextLine());
			double degrees=Double.parseDouble(scanner.nextLine());
			
			whiskeyLitresTotal+=whiskeyLitres;
			degreesTotal+=whiskeyLitres*degrees;
		}
		degreesAverage=degreesTotal/whiskeyLitresTotal;
		System.out.printf("Liter: %.2f"+"\n", whiskeyLitresTotal);
		System.out.printf("Degrees: %.2f"+"\n", degreesAverage);
		
		if(degreesAverage<38)
			System.out.print("Not good, you should baking!");
		else if(degreesAverage>=38 && degreesAverage<=42)
			System.out.print("Super!");
		else
			System.out.print("Dilution with distilled water!");
	}
}
