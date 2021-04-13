package conditional_statement_exercise;

import java.util.Scanner;

public class d_metric_converter 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number which you'd like to convert after you've chosen your metrics: ");
		double number=Double.parseDouble(scanner.nextLine());
		System.out.print("Select your initial metric."+"\n"+"You can choose from \"mm\", \"cm\" or \"m\": ");
		String inputMetric=scanner.nextLine();
		System.out.print("Select the metric you'd like your initial number to be converted to."+"\n"+"You can choose from \"mm\", \"cm\" or \"m\": ");
		String outputMetric=scanner.nextLine();
		
		if(inputMetric.equals("mm"))
			number=number/1000;		// 1 m.=1000 mm.
		else if(inputMetric.equals("cm"))
			number=number/100;		// 1 m.=100 cm.
		
		if(outputMetric.equals("mm"))
			number=number*1000;
		else if(outputMetric.equals("cm"))
			number=number*100;
		
		System.out.printf("%.3f", number);
	}
}
