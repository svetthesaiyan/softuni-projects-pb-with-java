package for_loop_extra_exercises;

import java.util.Scanner;

public class f_bills 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of months you'd like me to go through your bills for: ");
		int months=Integer.parseInt(scanner.nextLine());
		
		double waterBill=20;
		double internetBill=15;
		double otherExpenses=0;
		
		double electricityBillTotal=0;
		double waterBillTotal=0;
		double internetBillTotal=0;
		double otherExpensesTotal=0;
		
		for(int i=1; i<=months; i++)
		{
			System.out.print("Enter the electricity bill for month №"+i+": ");
			double electricityBill=Double.parseDouble(scanner.nextLine());
			
			electricityBillTotal+=electricityBill;
			waterBillTotal+=waterBill;
			internetBillTotal+=internetBill;
			otherExpenses=(electricityBill+waterBill+internetBill)*1.2;
			otherExpensesTotal+=otherExpenses;
		}
		
		System.out.println();
		double billAverage=(electricityBillTotal+waterBillTotal+internetBillTotal+otherExpensesTotal)/months;
		
		System.out.printf("The total sum of your electricity bills for the "+months+" months you wanted me to check is: %.2f lv."+"\n", electricityBillTotal);
		System.out.printf("The total sum of your water bills for the "+months+" months you wanted me to check is: %.2f lv."+"\n", waterBillTotal);
		System.out.printf("The total sum of your internet bills for the "+months+" months you wanted me to check is: %.2f lv."+"\n", internetBillTotal);
		System.out.printf("The total sum of your other expenses for the "+months+" months you wanted me to check is: %.2f lv."+"\n", otherExpensesTotal);
		System.out.printf("Your monthly bill expenses average at: %.2f lv.", billAverage);
	}
}
