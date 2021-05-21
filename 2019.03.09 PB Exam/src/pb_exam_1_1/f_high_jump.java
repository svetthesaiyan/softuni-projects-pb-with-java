package pb_exam_1_1;

import java.util.Scanner;

public class f_high_jump 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int jumpTarget=Integer.parseInt(scanner.nextLine());
		int jumpStart=jumpTarget-30;
		
		int jumpCounter=0;
		int jumpImprovement=jumpStart;
		
		boolean goalReached=false;
		
		int failedAttemptsCounter=0;
		while (failedAttemptsCounter<3)
		{
			int jumpHeight=Integer.parseInt(scanner.nextLine());
			if(jumpHeight>jumpImprovement)
			{
				jumpCounter++;
				jumpImprovement+=5;
				jumpStart=0;
				failedAttemptsCounter=0;
			}
			else
			{
				jumpCounter++;
				failedAttemptsCounter++;
			}
			
			if(jumpImprovement>jumpTarget)
			{
				goalReached=true;
				break;				
			}
		}
		
		if(goalReached)
			System.out.print("Tihomir succeeded, he jumped over "+jumpTarget+"cm after "+jumpCounter+" jumps.");
		else
			System.out.print("Tihomir failed at "+jumpImprovement+"cm after "+jumpCounter+" jumps.");
			
	}
}
