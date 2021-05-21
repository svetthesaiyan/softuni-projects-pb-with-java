package nested_loops_lab;

import java.util.Scanner;

public class e_travelling 
{
	public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your vacation destination: ");
        String destination=scanner.nextLine();
 
        while(!destination.equalsIgnoreCase("End"))
        {
        	System.out.print("Enter the price for said vacation: ");
            double excursionPrice=Double.parseDouble(scanner.nextLine());
            
            System.out.println("Enter how much money you're setting aside monthly for your vacation."+"\n"+"I'll interrupt you should you gather the required finances successfully.");
            double availableMoney=0;
            while(availableMoney<excursionPrice)
            {
                double savedMoney=Double.parseDouble(scanner.nextLine());
                availableMoney+=savedMoney;
            }
            
            System.out.println();
            System.out.printf("You've saved up enough money to go to %s!%nHave fun!%n%n", destination);
            
            System.out.println("Where are you going next?");
            destination=scanner.nextLine();
        }
        System.out.print("\n"+"Hope you enjoyed your holidays!");
	}
}
