package pb_mock_exam;

import java.util.Scanner;

public class d_balls 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int ballAmount=Integer.parseInt(scanner.nextLine());
		int points=0;
		
		int redBallCounter=0;
		int orangeBallCounter=0;
		int yellowBallCounter=0;
		int whiteBallCounter=0;
		int blackBallCounter=0;
		int otherBallCounter=0;
		
		for(int i=0; i<ballAmount; i++)
		{
			String ballColour=scanner.nextLine();
			switch (ballColour)
			{
				case "red":
					points+=5;
					redBallCounter++;
					break;
					
				case "orange":
					points+=10;
					orangeBallCounter++;
					break;
					
				case "yellow":
					points+=15;
					yellowBallCounter++;
					break;
					
				case "white":
					points+=20;
					whiteBallCounter++;
					break;
					
				case "black":
					points/=2;
					blackBallCounter++;
					break;
					
				default:
					otherBallCounter++;
					break;
			}
		}
		System.out.printf("Total points: %d"+"\n", points);
		System.out.printf("Points from red balls: %d"+"\n", redBallCounter);
		System.out.printf("Points from orange balls: %d"+"\n", orangeBallCounter);
		System.out.printf("Points from yellow balls: %d"+"\n", yellowBallCounter);
		System.out.printf("Points from white balls: %d"+"\n", whiteBallCounter);
		System.out.printf("Other colors picked: %d"+"\n", otherBallCounter);
		System.out.printf("Divides from black balls: %d", blackBallCounter);
	}
}
