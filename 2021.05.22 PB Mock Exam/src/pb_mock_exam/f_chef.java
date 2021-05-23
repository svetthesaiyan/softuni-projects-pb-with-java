package pb_mock_exam;

import java.util.Scanner;

public class f_chef 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int easterBreadCounter=Integer.parseInt(scanner.nextLine());
		int max=Integer.MIN_VALUE;
		String bestChef="";
		
		for(int easterBread=1; easterBread<=easterBreadCounter; easterBread++)
		{
			String chefName=scanner.nextLine();
			int totalGrade=0;
			
			String input=scanner.nextLine();
			while(!input.equals("Stop"))
			{
				int grade=Integer.parseInt(input);
				totalGrade+=grade;
				
				input=scanner.nextLine();
			}
			System.out.printf("%s has %d points."+"\n", chefName, totalGrade);
			
			if(totalGrade>max)
			{
				bestChef=chefName;
				System.out.printf("%s is the new number 1!"+"\n", bestChef);
				max=totalGrade;
			}
		}
		System.out.printf("%s won competition with %d points!", bestChef, max);	
	}
}
