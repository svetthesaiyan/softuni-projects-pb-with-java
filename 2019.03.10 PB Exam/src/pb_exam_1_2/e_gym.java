package pb_exam_1_2;

import java.util.Scanner;

public class e_gym 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int gymGoers=Integer.parseInt(scanner.nextLine());
		
		double workoutCounter=0;
		double proteinCounter=0;
		
		int backCounter=0;
		int chestCounter=0;
		int legsCounter=0;
		int absCounter=0;
		int proteinShakeCounter=0;
		int proteinBarCounter=0;
		
		for(int i=0; i<gymGoers; i++)
		{
			String gymActivity=scanner.nextLine();
			if(gymActivity.equals("Back") || gymActivity.equals("Chest") || gymActivity.equals("Legs") || gymActivity.equals("Abs"))
			{
				workoutCounter++;
				
				if(gymActivity.equals("Back"))
					backCounter++;
				else if(gymActivity.equals("Chest"))
					chestCounter++;
				else if(gymActivity.equals("Legs"))
					legsCounter++;
				else if(gymActivity.equals("Abs"))
					absCounter++;
			}
			else if (gymActivity.equals("Protein shake") || gymActivity.equals("Protein bar"))
			{
				proteinCounter++;
				
				if(gymActivity.equals("Protein shake"))
					proteinShakeCounter++;
				else if(gymActivity.equals("Protein bar"))
					proteinBarCounter++;
			}
		}
		System.out.printf("%d - back"+"\n", backCounter);
		System.out.printf("%d - chest"+"\n", chestCounter);
		System.out.printf("%d - legs"+"\n", legsCounter);
		System.out.printf("%d - abs"+"\n", absCounter);
		System.out.printf("%d - protein shake"+"\n", proteinShakeCounter);
		System.out.printf("%d - protein bar"+"\n", proteinBarCounter);
		
		System.out.printf("%.2f%% - work out"+"\n", (workoutCounter/gymGoers)*100);
		System.out.printf("%.2f%% - protein", (proteinCounter/gymGoers)*100);
	}
}
