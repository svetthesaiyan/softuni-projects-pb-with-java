package first_steps_in_programming_exercises;

import java.util.Scanner;

public class h_aquarium 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the length of your rectangular prism: ");
		int length=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter the width of your rectangular prism: ");
		int width=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter the height of your rectangular prism: ");
		int height=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter the percent of your rectangular prism's volume that's already occupied: ");
		double percent=Double.parseDouble(scanner.nextLine())/100;
		
		int volume=length*width*height;
		System.out.println();
		System.out.printf("The volume of your aquarium is %d cubed cm.", volume);
		double litres=volume*0.001;
		System.out.println();
		System.out.printf("That means that your aquarium can be filled with %.2f litres of water.", litres);
		double litres_real=litres*(1-percent);
		
		System.out.println();
		System.out.printf("The amount of litres that can actually be filled in your aquarium, when we take into account the items that are already in the tank, is %.2f litres.", litres_real);
	}
}
