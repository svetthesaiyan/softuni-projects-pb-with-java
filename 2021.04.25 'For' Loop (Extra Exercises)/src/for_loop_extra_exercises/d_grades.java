package for_loop_extra_exercises;

import java.util.Scanner;

public class d_grades
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of students who were present at the exam: ");
		int studentsAttended=Integer.parseInt(scanner.nextLine());
		
		double studentGradeTotal=0;
		
		double studentsPassedGrade=0;
		double studentsVeryGoodGrade=0;
		double studentsGoodGrade=0;
		double studentsFailedGrade=0;

		for(int i=1; i<=studentsAttended; i++)
		{
			System.out.print("Enter the grade for student №"+i+": ");
			double studentGrade=Double.parseDouble(scanner.nextLine());
			studentGradeTotal+=studentGrade;
			
			if(studentGrade>=5)
				studentsPassedGrade++;
			else if(studentGrade>=4.00 && studentGrade<=4.99)
				studentsVeryGoodGrade++;
			else if(studentGrade>=3.00 && studentGrade<=3.99)
				studentsGoodGrade++;
			else if(studentGrade>=2.00 && studentGrade<=2.99)
				studentsFailedGrade++;
		}
		
		System.out.println();
		double averageGrade=studentGradeTotal/studentsAttended;
		
		double studentsPassedGradePercent=(studentsPassedGrade/studentsAttended)*100;
		double studentsVeryGoodGradePercent=(studentsVeryGoodGrade/studentsAttended)*100;
		double studentsGoodGradePercent=(studentsGoodGrade/studentsAttended)*100;
		double studentsFailedGradePercent=(studentsFailedGrade/studentsAttended)*100;
		
		System.out.printf("The percentage of excellent students is: %.2f%%"+"\n", studentsPassedGradePercent);
		System.out.printf("The percentage of students with a grade between 4.00 and 4.99 is: %.2f%%"+"\n", studentsVeryGoodGradePercent);
		System.out.printf("The percentage of students with a grade between 3.00 and 3.99 is: %.2f%%"+"\n", studentsGoodGradePercent);
		System.out.printf("The percentage of students who failed is: %.2f%%"+"\n", studentsFailedGradePercent);
		System.out.printf("The average grade among all participating students is: %.2f", averageGrade);
	}
}
