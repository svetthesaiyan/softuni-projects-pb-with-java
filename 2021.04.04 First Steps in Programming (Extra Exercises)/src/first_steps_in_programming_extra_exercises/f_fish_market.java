package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class f_fish_market 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double skumriq_price=Double.parseDouble(scanner.nextLine());
		double tsatsa_price=Double.parseDouble(scanner.nextLine());
		double palamud_price=skumriq_price+(skumriq_price*0.6);
		double safrid_price=tsatsa_price+(tsatsa_price*0.8);
		double midi_price=7.50;
		
		// double skumriq_weight
		// double tsatsa_weight
		double palamud_weight=Double.parseDouble(scanner.nextLine());
		double safrid_weight=Double.parseDouble(scanner.nextLine());
		int midi_weight=Integer.parseInt(scanner.nextLine());
		
		// double skumriq_sum=skumriq_price*skumriq_weight;
		// double tsatsa_sum=tsatsa_price*tsatsa_weight;
		double palamud_sum=palamud_price*palamud_weight;
		double safrid_sum=safrid_price*safrid_weight;
		double midi_sum=midi_price*midi_weight;
		
		System.out.printf("%.2f", palamud_sum+safrid_sum+midi_sum);
	}
}
