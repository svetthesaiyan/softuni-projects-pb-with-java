package pb_pre_exam;

import java.util.Scanner;

public class b_santa_deer 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int daysGone=Integer.parseInt(scanner.nextLine());
		int foodLeft=Integer.parseInt(scanner.nextLine());
		double foodFirstDeer=Double.parseDouble(scanner.nextLine());
		double foodSecondDeer=Double.parseDouble(scanner.nextLine());
		double foodThirdDeer=Double.parseDouble(scanner.nextLine());
		
		double foodRequired=(foodFirstDeer+foodSecondDeer+foodThirdDeer)*daysGone;
		if(foodLeft>=foodRequired)
		{
			System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft-foodRequired));
		}
		else
		{
			System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodRequired-foodLeft));
		}
	
	}
}
