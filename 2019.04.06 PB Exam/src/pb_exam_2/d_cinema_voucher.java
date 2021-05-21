package pb_exam_2;

import java.util.Scanner;

public class d_cinema_voucher 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int voucher=Integer.parseInt(scanner.nextLine());
		
		int tickets=0;
		int otherStuff=0;
		
		String purchase=scanner.nextLine();
		while(!purchase.equals("End"))
		{
			int price=0;
			
			if(purchase.length()>8)
			{
				price=purchase.charAt(0);
				price+=purchase.charAt(1);
				
				if(price>voucher)
					break;
				else
				{
					tickets++;
					voucher-=price;
				}
			}
			else
			{
				price=purchase.charAt(0);	
				
				if(price>voucher)
					break;
				else
				{
					otherStuff++;
					voucher-=price;
				}
			}
			purchase=scanner.nextLine();
		}
		System.out.print(tickets+"\n"+otherStuff);
	}
}
