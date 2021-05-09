package while_loop_lab;

import java.util.Scanner;

public class e_account_balance 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how much money you're adding to your bank account or if you've run out of money and are currently dangerously close to filing for bankruptcy.");
		String text=scanner.nextLine();
		
		double sumTotal=0;
		
		while(!text.equalsIgnoreCase("No more money"))
		{
			double sum=Double.parseDouble(text); // преобразуваме въведеното за променливата 'text' в тип 'double', в случай че е нещо различно от текст (число)
			
			if(sum<0)
			{
				System.out.println("Invalid operation!");
				break;
			}
			else
			{
				System.out.printf("Bank account balance increased with: %.2f lv."+"\n", sum);
				sumTotal+=sum;
			}
			
			text=scanner.nextLine();
		}
		System.out.println();
		System.out.printf("Current bank account balance: %.2f lv.", sumTotal);
	}
}
