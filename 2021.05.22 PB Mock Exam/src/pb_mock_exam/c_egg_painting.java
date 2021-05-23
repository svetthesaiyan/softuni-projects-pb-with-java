package pb_mock_exam;

import java.util.Scanner;

public class c_egg_painting 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String eggSize=scanner.nextLine();
		String eggColour=scanner.nextLine();
		int eggBatchAmount=Integer.parseInt(scanner.nextLine());
		
		int eggPrice=0;
		
		switch(eggSize)
		{
			case "Large":
				if(eggColour.equals("Red"))
					eggPrice=16;
				else if(eggColour.equals("Green"))
					eggPrice=12;
				else if(eggColour.equals("Yellow"))
					eggPrice=9;
				break;
				
			case "Medium":
				if(eggColour.equals("Red"))
					eggPrice=13;
				else if(eggColour.equals("Green"))
					eggPrice=9;
				else if(eggColour.equals("Yellow"))
					eggPrice=7;
				break;
			
			case "Small":
				if(eggColour.equals("Red"))
					eggPrice=9;
				else if(eggColour.equals("Green"))
					eggPrice=8;
				else if(eggColour.equals("Yellow"))
					eggPrice=5;
				break;
		}
		double profit=(eggBatchAmount*eggPrice)*0.65;
		System.out.printf("%.2f leva.", profit);
	}
}
