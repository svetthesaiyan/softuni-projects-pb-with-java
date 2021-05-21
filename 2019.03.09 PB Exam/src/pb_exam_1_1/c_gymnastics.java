package pb_exam_1_1;

import java.util.Scanner;

public class c_gymnastics 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String country=scanner.nextLine();
		String equipment=scanner.nextLine();
		
		double difficultyScore=0;
		double executionScore=0;
		
		switch(country)
		{
			case "Russia":
				if(equipment.equals("ribbon"))
				{
					difficultyScore=9.1;
					executionScore=9.4;
				}
				else if(equipment.equals("hoop"))
				{
					difficultyScore=9.3;
					executionScore=9.8;
				}
				else if(equipment.equals("rope"))
				{
					difficultyScore=9.6;
					executionScore=9;
				}
				break;
				
			case "Bulgaria":
				if(equipment.equals("ribbon"))
				{
					difficultyScore=9.6;
					executionScore=9.4;
				}
				else if(equipment.equals("hoop"))
				{
					difficultyScore=9.55;
					executionScore=9.75;
				}
				else if(equipment.equals("rope"))
				{
					difficultyScore=9.5;
					executionScore=9.4;
				}
				break;
				
			case "Italy":
				if(equipment.equals("ribbon"))
				{
					difficultyScore=9.2;
					executionScore=9.5;
				}
				else if(equipment.equals("hoop"))
				{
					difficultyScore=9.45;
					executionScore=9.35;
				}
				else if(equipment.equals("rope"))
				{
					difficultyScore=9.7;
					executionScore=9.15;
				}
				break;
		}
		
		double pointsMax=20;
		double pointsTotal=difficultyScore+executionScore;
		System.out.printf("The team of %s get %.3f on %s."+"\n", country, pointsTotal, equipment);
		System.out.printf("%.2f%%", (100-((pointsTotal/pointsMax)*100)));
	}
}
