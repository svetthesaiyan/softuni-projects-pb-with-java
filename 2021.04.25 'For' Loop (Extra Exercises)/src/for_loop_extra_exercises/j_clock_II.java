package for_loop_extra_exercises;

public class j_clock_II 
{
	public static void main(String[] args) 
	{
		int hoursCap=23;
		int minutesCap=59;
		int secondsCap=59;
//		long loopCounter=0;
		
		for(int hour=0; hour<=hoursCap; hour++)
		{
			for(int minute=0; minute<=minutesCap; minute++)
			{
				for(int second=0; second<=secondsCap; second++)
				{
//					loopCounter++;
					System.out.printf("%02d:%02d:%02d"+"\n", hour, minute, second);
				}
			}
		}
//		System.out.print("The amount of loops that this program goes through in order to correctly display the time on digital watches every single day is: "+loopCounter);
	}
}
