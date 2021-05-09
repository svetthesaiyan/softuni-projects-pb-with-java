package while_loop_lab;

import java.util.Scanner;

public class i_moving 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the width of your apartment: ");
		int apartmentWidth=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the length of your apartment: ");
		int apartmentLength=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the height of your apartment: ");
		int apartmentHeight=Integer.parseInt(scanner.nextLine());
		int apartmentVolume=apartmentWidth*apartmentLength*apartmentHeight;
		
		int boxCountSum=0;
		
		System.out.println("Enter however many boxes of your belongings you have to move to your new apartment. I'll interrupt you if you don't have any more space in your apartment."+"\n"+"Write \"Done\" when you've finished inputting the amount of boxes you'll be moving over.");
		String text=scanner.nextLine();
		
		while(!text.equals("Done"))
		{
			int boxCount=Integer.parseInt(text);
			boxCountSum+=boxCount;
			
			if(apartmentVolume<boxCountSum)
			{
				System.out.println();
				System.out.printf("You don't have enough space in your apartment for any more belongings! You need %d more cubic metres of space if you'd like to move those boxes over.", (boxCountSum-apartmentVolume));
				break;
			}
			text=scanner.nextLine();
		}
		
		// ако се напише "Done"
		if(apartmentVolume>=boxCountSum)
		{
			System.out.println();
			System.out.printf("You have enough space to fit all of your belongings in your new apartment. You'd be left with %d cubic metres of additional space after moving everything over.", (apartmentVolume-boxCountSum));
		}
	}
}
