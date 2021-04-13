package conditional_statements_lab;
 
import java.util.Scanner;
 
public class g_toy_shop
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        double puzzlePrice=2.6;
        double dollPrice=3;
        double teddyBearPrice=4.1;
        double minionPrice=8.2;
        double truckPrice=2;
        
        System.out.print("Enter the price of your dream vacation: ");
        double tripPrice=Double.parseDouble(scanner.nextLine());
        System.out.print("Enter how many puzzle sets you'd like to purchase: ");
        int puzzleQuantity=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter how many dolls you'd like to purchase: ");
        int dollQuantity=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter how many teddy bears you'd like to purchase: ");
        int teddyBearQuantity=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter how many minion plushies you'd like to purchase: ");
        int minionQuantity=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter how many toy trucks you'd like to purchase: ");
        int truckQuantity=Integer.parseInt(scanner.nextLine());
        System.out.println();
        
        double puzzleSum=puzzlePrice*puzzleQuantity;
        double dollSum=dollPrice*dollQuantity;
        double teddyBearSum=teddyBearPrice*teddyBearQuantity;
        double minionSum=minionPrice*minionQuantity;
        double truckSum=truckPrice*truckQuantity;
        
        int toyQuantityTotal=puzzleQuantity+dollQuantity+teddyBearQuantity+minionQuantity+truckQuantity;
        System.out.println("You have purchased a total of "+toyQuantityTotal+" toys.");
        double toySumTotal=puzzleSum+dollSum+teddyBearSum+minionSum+truckSum;
        System.out.printf("Your purchase will cost %.2f leva without any discounts.", toySumTotal);
        System.out.println();
        
        if(toyQuantityTotal>=50)    // 1ви главен подслучай
        {
            double toySumTotalDiscount=toySumTotal-(toySumTotal*0.25);
            System.out.printf("Your purchase will cost %.2f leva with discounts. %n", toySumTotalDiscount);
            double moneyAfterRent=toySumTotalDiscount-(toySumTotalDiscount*0.1);
            System.out.printf("You will have %.2f leva left after paying for rent. %n", moneyAfterRent);
            System.out.println();
            
            if(moneyAfterRent>=tripPrice)   // 1ви подслучай на 1ви главен подслучай
            {
                double moneyAfterTrip=moneyAfterRent-tripPrice;
                System.out.printf("You have saved up enough money to go on holiday! %nYou will have %.2f leva left after paying your holiday expenses.", moneyAfterTrip);
            }
            else    // 2ри подслучай на 1ви главен подслучай
            {
                double moneyNeededForTrip=tripPrice-moneyAfterRent;
                System.out.printf("You do not have enough money saved to go on holiday... %nYou need %.2f more leva in order to go on holiday.", moneyNeededForTrip);
            }
        }
        else    // 2ри главен подслучай
        {
            System.out.println("You have not purchased enough toys in order to be eligible for a discount.");
            double moneyAfterRent=toySumTotal-(toySumTotal*0.1);
            System.out.printf("You will have %.2f leva left after paying for rent. %n", moneyAfterRent);
            System.out.println();
            
            if(moneyAfterRent>=tripPrice)   // 1ви подслучай на 2ри главен подслучай
            {
                double moneyAfterTrip=moneyAfterRent-tripPrice;
                System.out.printf("You have saved up enough money to go on holiday! %nYou will have %.2f leva left after paying your holiday expenses.", moneyAfterTrip);
            }
            else    // 2ри подслучай на 2ри главен подслучай
            {
                double moneyNeededForTrip=tripPrice-moneyAfterRent;
                System.out.printf("You do not have enough money saved to go on holiday... %nYou need %.2f more leva in order to go on holiday.", moneyNeededForTrip);
            }
        }
    }
}