package while_loop_exercise;

import java.util.Scanner;

public class b_exam_revision 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of unsatisfactory results Marin must get in order for him to realise he has to take a break: ");
		int failedThreshold=Integer.parseInt(scanner.nextLine());
		
		int failedCounter=0;
		int solvedProblemsCounter=0;
		double gradesSum=0;
		String lastProblem="";
		boolean isFailed=true;
		
		while(failedCounter<failedThreshold)
		{
			System.out.println();
			System.out.print("Enter the name of the exercise: ");
			String problemName=scanner.nextLine();
			if(problemName.equalsIgnoreCase("Enough"))
			{
				isFailed=false;
				break;
			}
			
			System.out.print("Enter the grade Marin got for exercise \""+problemName+"\": ");
			int grade=Integer.parseInt(scanner.nextLine());
			if(grade<=4)
				failedCounter++;
			
			gradesSum+=grade;
			solvedProblemsCounter++;
			lastProblem=problemName;
		}
		
		System.out.println();
		if(isFailed)
		{
			System.out.printf("Marin is in dire need of a break."+"\n"+"He had %d poor grades during this lesson.", failedThreshold);
		}
		else
		{
			System.out.printf("Marin's average grade among the %d problems he had to solve was %.2f"+"\n", solvedProblemsCounter, (gradesSum/solvedProblemsCounter));
			System.out.printf("The name of his last exercise was \"%s\".", lastProblem);
		}
	}
}
