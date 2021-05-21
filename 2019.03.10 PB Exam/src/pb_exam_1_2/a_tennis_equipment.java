package pb_exam_1_2;

import java.util.Scanner;

public class a_tennis_equipment 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double racketCost=Double.parseDouble(scanner.nextLine());
		int racketAmount=Integer.parseInt(scanner.nextLine());
		int shoePairs=Integer.parseInt(scanner.nextLine());
		double shoePairCost=racketCost*1/6;
		double otherEquipment=(racketCost*racketAmount+shoePairCost*shoePairs)*0.2;
		
		double totalCost=racketCost*racketAmount+shoePairCost*shoePairs+otherEquipment;
		double sponsorPay=totalCost*7/8;
		double atheletePay=totalCost-sponsorPay;
				
		System.out.printf("Price to be paid by Djokovic %.0f"+"\n", Math.floor(atheletePay));
		System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(sponsorPay));
	}
}
