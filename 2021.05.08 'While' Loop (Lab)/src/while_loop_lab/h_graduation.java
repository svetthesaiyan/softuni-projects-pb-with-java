package while_loop_lab;

import java.util.Scanner;

public class h_graduation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student's name: ");
		String studentName=scanner.nextLine();
		
		double annualGradeSum=0;
		int annualGradeDropoutCount=0;
		
		double annualGradeCount=0;
		while(annualGradeCount<12)
		{
			System.out.print("Enter "+studentName+"'s annual grade for Year "+((int) annualGradeCount+1)+": ");
			double annualGrade=Double.parseDouble(scanner.nextLine());
			annualGradeSum+=annualGrade;
			annualGradeCount++;
			
			if(annualGrade>=4)
			{
				if(annualGradeCount==12)
				{
					System.out.println();
					System.out.printf("%s made it all the way through primary and secondary school!"+"\n"+"Their average grade is: %.2f", studentName, (annualGradeSum/annualGradeCount));
					break;
				}
				else
					continue;
			}
			
			else if(annualGrade<4)
			{
				annualGradeDropoutCount++;
				
				if(annualGradeDropoutCount==2)
				{
					System.out.println();
				System.out.printf("%s has been excluded in Year %.0f."+"\n"+"They ought to have paid more attention in class...", studentName, (annualGradeCount-1));
				break;
				}
				else
					continue;
			}
		}
	}
}
