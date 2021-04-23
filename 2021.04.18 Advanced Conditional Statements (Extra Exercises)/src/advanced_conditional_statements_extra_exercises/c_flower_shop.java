package advanced_conditional_statements_extra_exercises;

import java.util.Scanner;

public class c_flower_shop 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of chrysanthemums you'd like to buy: ");
		int chrysanthemum=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of roses you'd like to buy: ");
		int rose=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the amount of tulips you'd like to buy: ");
		int tulip=Integer.parseInt(scanner.nextLine());
		System.out.print("Choose whether the season in which you're buying your flowers is either \"Spring\", \"Summer\", \"Autumn\" or \"Winter\": ");
		String season=scanner.nextLine();
		System.out.println("Are you going to be buying these flowers during a holiday?");
		String holiday=scanner.nextLine();
		System.out.println("");
		
		double chrysanthemumPrice=0;
		double rosePrice=0;
		double tulipPrice=0;
		
		double flowerSum=0;
		
		if(season.equals("Spring") || season.equals("Summer"))
		{
			chrysanthemumPrice=2;
			rosePrice=4.1;
			tulipPrice=2.5;
			
			if(tulip>7 && season.equals("Spring"))
				flowerSum=((chrysanthemumPrice*chrysanthemum)+(rosePrice*rose)+(tulipPrice*tulip))*0.95;
			else
				flowerSum=(chrysanthemumPrice*chrysanthemum)+(rosePrice*rose)+(tulipPrice*tulip);
		}
		
		else if(season.equals("Autumn") || season.equals("Winter"))
		{
			chrysanthemumPrice=3.75;
			rosePrice=4.5;
			tulipPrice=4.15;
			
			if(rose>=10 && season.equals("Winter"))
				flowerSum=((chrysanthemumPrice*chrysanthemum)+(rosePrice*rose)+(tulipPrice*tulip))*0.9;
			else
				flowerSum=(chrysanthemumPrice*chrysanthemum)+(rosePrice*rose)+(tulipPrice*tulip);
		}
		
		if(chrysanthemum+rose+tulip>20)
			flowerSum*=0.8;
		
		if(holiday.equalsIgnoreCase("yes"))
			System.out.printf("Your bouquet will cost %.2f lv.", (flowerSum*1.15)+2);
		else if(holiday.equalsIgnoreCase("no"))
			System.out.printf("Your bouquet will cost %.2f lv.", flowerSum+2);
	}
}
