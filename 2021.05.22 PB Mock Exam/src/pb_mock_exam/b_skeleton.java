package pb_mock_exam;

import java.util.Scanner;

public class b_skeleton 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int minutesGoal=Integer.parseInt(scanner.nextLine());
		int secondsGoal=Integer.parseInt(scanner.nextLine());
		double trackLength=Double.parseDouble(scanner.nextLine());
		int hundredMetresInSecs=Integer.parseInt(scanner.nextLine());
		
		int timeGoal=(minutesGoal*60)+secondsGoal; // in seconds
		
		double cooldownTime=(trackLength/120)*2.5;
		
		double MarinTime=(trackLength/100)*hundredMetresInSecs-cooldownTime;
		
		if(MarinTime<=timeGoal)
		{
			System.out.println("Marin Bangiev won an Olympic quota!");
			System.out.printf("His time is %.3f.", MarinTime);
		}
		else
			System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(MarinTime-timeGoal));
	}
}
