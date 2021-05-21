package pb_exam_2;

import java.util.Scanner;

public class b_godzilla_vs_kong
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double budget=Double.parseDouble(scanner.nextLine());
		int actors=Integer.parseInt(scanner.nextLine());
		double garmentPricePerActor=Double.parseDouble(scanner.nextLine());
		
		double decor=budget*0.1;
		double garmentPriceTotal=actors*garmentPricePerActor;
		
		if(actors>150)
			garmentPriceTotal*=0.9;
		
		if((decor+garmentPriceTotal)>budget)
		{
			System.out.printf("Not enough money!"+"\n"+"Wingard needs %.2f leva more.", (decor+garmentPriceTotal)-budget);
		}
		else
			System.out.printf("Action!"+"\n"+"Wingard starts filming with %.2f leva left.", Math.abs((decor+garmentPriceTotal)-budget));
	}
}
