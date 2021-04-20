package first_steps_in_programming_lab;

import java.util.Scanner;

public class g_project_completion 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the name of the architect: ");
		String architect_name=scanner.nextLine();
		System.out.print("Please enter how many projects (s)he has: ");
		int project_quantity=Integer.parseInt(scanner.nextLine());
		System.out.println();
		int hours=project_quantity*3;
		
		System.out.println("The architect "+architect_name+" will need "+hours+" hours to complete "+project_quantity+" project(s).");
		// System.out.printf("The architect %s will need %d hours to complete %d project/s.", architect_name, hours, project_quantity);	-more practical way
	}
}
