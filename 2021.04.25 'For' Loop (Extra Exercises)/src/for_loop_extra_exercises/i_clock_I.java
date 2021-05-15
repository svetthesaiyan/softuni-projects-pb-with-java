package for_loop_extra_exercises;

public class i_clock_I 
{
	public static void main(String[] args) 
	{
		int hoursCap=23;
		int minutesCap=59;

		for(int hour=0; hour<=hoursCap; hour++)
		{
			for(int minute=0; minute<=minutesCap; minute++)
			{
				System.out.printf("%02d:%02d"+"\n", hour, minute);
			}
		}
	}
}
