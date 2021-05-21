package nested_loops_exercise;

import java.util.Scanner;

public class e_password_generator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num1=Integer.parseInt(scanner.nextLine());
		int num2=Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<=num1; i++) // 1ва цифра
		{
			for(int j=1; j<=num1; j++) // 2ра цифра
			{
				for(int k=1; k<=num2; k++) // 1ва буква 
				{
					String letterK="";
					int asciiValueOfK=k+96;
					letterK=Character.toString((char)asciiValueOfK); // превръщане на целоцифрено число в буква
					
					for(int l=1; l<=num2; l++) // 2ра буква
					{
						String letterL="";
						int asciiValueOfL=l+96;
						letterL=Character.toString((char)asciiValueOfL);
						
						for(int m=1; m<=num1; m++) // последна цифра
						{
							if(m>i && m>j)
								System.out.printf("%d%d%s%s%d ", i, j, letterK, letterL, m);
						}
					}
				}
			}
		}
	}
}
