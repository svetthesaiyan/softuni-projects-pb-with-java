package pb_pre_exam;

import java.util.Scanner;

public class a_christmas_preparation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int wrappingPaperAmount=Integer.parseInt(scanner.nextLine());
		int textileAmount=Integer.parseInt(scanner.nextLine());
		double glueLitres=Double.parseDouble(scanner.nextLine());
		int discountPercentage=Integer.parseInt(scanner.nextLine());
		
		double wrappingPaperPrice=wrappingPaperAmount*5.8;
		double textilePrice=textileAmount*7.2;
		double gluePrice=glueLitres*1.2;
		double totalPrice=wrappingPaperPrice+textilePrice+gluePrice;
		double discountedPrice=totalPrice-(totalPrice*discountPercentage/100);
		
		System.out.printf("%.3f", discountedPrice);
	}
}
