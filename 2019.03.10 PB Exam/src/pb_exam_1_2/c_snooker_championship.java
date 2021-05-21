package pb_exam_1_2;

import java.util.Scanner;

public class c_snooker_championship 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String phase=scanner.nextLine();
		String ticketType=scanner.nextLine();
		int ticketAmount=Integer.parseInt(scanner.nextLine());
		String isPhotoTaken=scanner.nextLine();
		
		double ticketPrice=0;
		
		switch(phase)
		{
			case "Quarter final":
				if(ticketType.equals("Standard"))
					ticketPrice=ticketAmount*55.5;
				else if(ticketType.equals("Premium"))
					ticketPrice=ticketAmount*105.2;
				else if(ticketType.equals("VIP"))
					ticketPrice=ticketAmount*118.9;
			break;
			
			case "Semi final":
				if(ticketType.equals("Standard"))
					ticketPrice=ticketAmount*75.88;
				else if(ticketType.equals("Premium"))
					ticketPrice=ticketAmount*125.22;
				else if(ticketType.equals("VIP"))
					ticketPrice=ticketAmount*300.4;
			break;
			
			case "Final":
				if(ticketType.equals("Standard"))
					ticketPrice=ticketAmount*110.1;
				else if(ticketType.equals("Premium"))
					ticketPrice=ticketAmount*160.66;
				else if(ticketType.equals("VIP"))
					ticketPrice=ticketAmount*400;
			break;
		}
		
		boolean isPhotoFree=false;
		
		if(ticketPrice>4000)
		{
			isPhotoFree=true;
			ticketPrice*=0.75;
		}
		else if(ticketPrice>2500)
			ticketPrice*=0.9;
		
		if(isPhotoTaken.equals("Y") && !isPhotoFree)
			ticketPrice+=ticketAmount*40;
		
		System.out.printf("%.2f", ticketPrice);
	}
}
