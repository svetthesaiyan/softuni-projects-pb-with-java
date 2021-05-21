package pb_exam_2;

import java.util.Scanner;

public class a_oscars_ceremony 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double rent=Double.parseDouble(scanner.nextLine());
		
		double statuette=rent*0.7;
		double catering=statuette*0.85;
		double audio=catering*0.5;
		
		System.out.printf("%.2f", (rent+statuette+catering+audio));
	}
}
