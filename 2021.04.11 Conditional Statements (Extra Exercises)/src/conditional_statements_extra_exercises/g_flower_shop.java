package conditional_statements_extra_exercises;

import java.util.Scanner;

public class g_flower_shop 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter how many magnolias you wish to buy: ");
		int magnoliaAmount=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many hyacinths you wish to buy: ");
		int hyacinthAmount=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many roses you wish to buy: ");
		int roseAmount=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter how many cacti you wish to buy: ");
		int cactusAmount=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter your budget: ");
		double presentPrice=Double.parseDouble(scanner.nextLine());
		System.out.println();
		
		double magnoliaPrice=3.25;
		double hyacinthPrice=4;
		double rosePrice=3.5;
		double cactusPrice=8;
		
		double flowerSum=(magnoliaAmount*magnoliaPrice)+(hyacinthAmount*hyacinthPrice)+(roseAmount*rosePrice)+(cactusAmount*cactusPrice);
		
		double flowerSumAfterTax=flowerSum-(flowerSum*0.05);	// flowerSumAfterTax=flowerSum*0.95;
		
		if(flowerSumAfterTax>=presentPrice)
			System.out.printf("Maria will be left with %.0f leva after purchasing the flowers and subsequently paying tax.", Math.floor(flowerSumAfterTax-presentPrice));
		else
			System.out.printf("Unfortunately, Maria doesn't have enough money for all of those flowers."+"\n"+"She will have to borrow %.0f leva.", Math.ceil(presentPrice-flowerSumAfterTax));
	}
}
