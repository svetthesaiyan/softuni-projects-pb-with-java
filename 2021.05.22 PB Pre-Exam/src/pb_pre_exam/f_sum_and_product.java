package pb_pre_exam;

import java.util.Scanner;

public class f_sum_and_product 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		
		boolean isFirstCombo=false;
		boolean isSecondCombo=false;
		boolean isNoCombo=false;
		
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		
		for(a=1; a<=9; a++)
		{
			for(b=9; b>=a; b--)
			{
				for(c=0; c<=9; c++)
				{
					for(d=9; d>=c; d--)
					{
						int symbolSum=a+b+c+d;
						int symbolProduct=a*b*c*d;
						
						if(symbolSum==symbolProduct && n%10==5)
						{
							isFirstCombo=true;
							break;
						}
						else if(symbolProduct/symbolSum==3 && n%3==0)
						{
							isSecondCombo=true;
							break;
						}
						else
							isNoCombo=true;
					}
					if(isFirstCombo || isSecondCombo)
						break;
				}
				if(isFirstCombo || isSecondCombo)
					break;
			}
			if(isFirstCombo || isSecondCombo)
				break;
		}
		
		if(isFirstCombo)
			System.out.printf("%d%d%d%d", a, b, c, d);
		else if(isSecondCombo)
			System.out.printf("%d%d%d%d", d, c, b, a);
		else if(isNoCombo)
			System.out.print("Nothing found");
	}
}
