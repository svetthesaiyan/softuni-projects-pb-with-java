package nested_loops_exercise;

import java.util.Scanner;

public class d_train_the_trainers 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of judges overlooking this contest: ");
		int judgeAmount=Integer.parseInt(scanner.nextLine());
		
		double gradeSumTotal=0;
		int presentationCounter=1;
		
		System.out.print("Enter the name of presentation №"+presentationCounter+": ");
		String input=scanner.nextLine();
		while(!input.equalsIgnoreCase("Finish"))
		{
			String presentation=input;
			
			double gradeSum=0;
			double gradeAverage=0;
			
			for(int i=1; i<=judgeAmount; i++)
			{
				System.out.print("Enter judge №"+i+"'s evaluation of presentation \""+presentation+"\": ");
				double grade=Double.parseDouble(scanner.nextLine());
				gradeSum+=grade;
			}
			gradeAverage=gradeSum/judgeAmount;
			gradeSumTotal+=gradeAverage;
			
			System.out.printf("Student's average grade for presentation \"%s\" is: %.2f"+"\n", presentation, gradeAverage);
			
			presentationCounter++;
			System.out.print("\n"+"Enter the name of presentation №"+presentationCounter+": ");
			input=scanner.nextLine();
		}
		System.out.printf("\n"+"Student's final (average) grade of the %d presentations he talked about is: %.2f", presentationCounter, (gradeSumTotal/presentationCounter)); // намираме средно-аритметичното на средните оценки за отделните презентации
	}
}
