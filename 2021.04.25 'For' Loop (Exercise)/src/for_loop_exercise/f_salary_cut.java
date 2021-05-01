package for_loop_exercise;

import java.util.Scanner;

public class f_salary_cut
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter how many tabs of said social media you have open while at work: ");
		int tabs=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your monthly salary at your current job: ");
		int salary=Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<=tabs; i++)
		{
			System.out.print("Enter the site you were browsing while at work: ");
			String site=scanner.nextLine();
					
			if(site.equalsIgnoreCase("Facebook"))
				salary-=150;
			else if(site.equalsIgnoreCase("Instagram"))
				salary-=100;
			else if(site.equalsIgnoreCase("Reddit"))
				salary-=50;
			
			if(salary<=0)
			{
				System.out.println();
				System.out.println("You have completely lost your salary due to multiple breaches in your working contract.");
				break; // веднага се прекратява програмата, ако заплатата стане по-малка от 0.00 лв.
			}
		}
		
		if(salary>0)
		{
			System.out.println();
			System.out.printf("You'll be paid %d lv. this month."+"\n"+"This may or may not be lower than your usual wage depending on whether or not you were distracted at work.", salary);
		}
	}
}
