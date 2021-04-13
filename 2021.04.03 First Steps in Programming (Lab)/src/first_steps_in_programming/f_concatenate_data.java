package first_steps_in_programming;

import java.util.Scanner;

public class f_concatenate_data 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String first_name=scanner.nextLine();
		System.out.print("Please enter your last name: ");
		String family_name=scanner.nextLine();
		System.out.print("Please enter your age: ");
		int age=Integer.parseInt(scanner.nextLine());
		System.out.print("Please enter your place of birth: ");
		String city=scanner.nextLine();
		
		System.out.println();
		System.out.println("You are "+first_name+" "+family_name+", a "+age+"-year old person from "+city+".");
		// System.out.printf("You are %s %s, a %d-year old person from %s.", first_name, family_name, age, city);	-more practical way	
	}
}
