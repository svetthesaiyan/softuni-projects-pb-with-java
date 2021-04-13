package first_steps_in_programming_extra_exercises;

import java.util.Scanner;

public class g_house_paintjob 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double x=Double.parseDouble(scanner.nextLine());
		double y=Double.parseDouble(scanner.nextLine());
		double h=Double.parseDouble(scanner.nextLine());
		
		double frontAndBackWallArea=(2*x*x)-(1.2*2);
		double sideWallArea=(2*x*y)-((1.5*1.5)*2);
		double roofArea=(2*x*y)+(x*h);
		
		double greenPaintArea=frontAndBackWallArea+sideWallArea;
		double redPaintArea=roofArea;
		
		double greenPaintLitres=greenPaintArea/3.4;
		double redPaintLitres=redPaintArea/4.3;

		System.out.printf("%.2f%n", greenPaintLitres);
		System.out.printf("%.2f", redPaintLitres);
	}
}
