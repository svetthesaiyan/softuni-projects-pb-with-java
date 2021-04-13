package conditional_statement_exercise;

import java.util.Scanner;

public class c_speed_info 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your speed: ");
		double speed=Double.parseDouble(scanner.nextLine());
		
		if(speed<=10)
			System.out.println("You are too slow!");
		else if(speed>10 && speed<=50)
			System.out.println("Painfully average... Pick up the pace!");
		else if(speed>50 && speed<=150)
			System.out.println("You're fast but are you fast enough to keep up with me?");
		else if(speed>150 && speed<=1000)
			System.out.println("You are ultra fast! I think you might just pose a challenge to me after all...");
		else
			System.out.println("Wait up! You're extremely fast and I just can't keep up with you.");
	}
}
