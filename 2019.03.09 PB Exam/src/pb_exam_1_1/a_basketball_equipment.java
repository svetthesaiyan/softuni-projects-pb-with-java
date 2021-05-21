package pb_exam_1_1;

import java.util.Scanner;

public class a_basketball_equipment 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int annualFee=Integer.parseInt(scanner.nextLine());
		
		double sneakers=annualFee*0.6;
		double kit=sneakers*0.8;
		double ball=kit*0.25;
		double accessories=ball*0.2;
		
		System.out.printf("%.2f", (annualFee+sneakers+kit+ball+accessories));
	}
}
