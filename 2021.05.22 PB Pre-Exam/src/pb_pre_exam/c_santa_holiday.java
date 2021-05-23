package pb_pre_exam;

import java.util.Scanner;

public class c_santa_holiday 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int daysStayed=Integer.parseInt(scanner.nextLine()); // тази променлива ползваме да зададем условието на условната конструкция
		int nightsStayed=daysStayed-1;	// тази променлива ползваме в самите условни конструкции
		String roomType=scanner.nextLine();
		String rating=scanner.nextLine();
		
		double roomOnePrice=18;
		double roomApartmentPrice=25;
		double roomPresidentApartmentPrice=35;
		
		double price=0;
		
		switch(roomType)
		{
		case "room for one person":
				price=nightsStayed*roomOnePrice;
			break;
			
		case "apartment":
			if(daysStayed<10)
				price=(nightsStayed*roomApartmentPrice)*0.7;
			else if(daysStayed>=10 && daysStayed<=15)
				price=(nightsStayed*roomApartmentPrice)*0.65;
			else if(daysStayed>15) 
				price=(nightsStayed*roomApartmentPrice)*0.5;
			break;
			
		case "president apartment":
			if(daysStayed<10)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.9;
			else if(daysStayed>=10 && daysStayed<=15)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.85;
			else if(daysStayed>15)
				price=(nightsStayed*roomPresidentApartmentPrice)*0.8;
			break;
		}
		
		if(rating.equals("positive"))
		{
			price*=1.25;
			System.out.printf("%.2f", price);
		}
		
		else if(rating.equals("negative"))
		{
			price*=0.9;
			System.out.printf("%.2f", price);
		}
	}
}
