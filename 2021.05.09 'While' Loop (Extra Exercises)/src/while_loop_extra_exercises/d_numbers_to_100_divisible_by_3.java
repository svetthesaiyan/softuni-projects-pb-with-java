package while_loop_extra_exercises;

public class d_numbers_to_100_divisible_by_3 
{
	public static void main(String[] args) 
	{
		int numberCap=100;
		System.out.println("All of the numbers from 1 to 100 that are divisible by 3 are as follows: ");
		System.out.println();
		int successfulLoopCounter=0;
		
		int loopCounter=1;
		while(loopCounter<=numberCap)
		{
			if(loopCounter%3==0)
			{
				successfulLoopCounter++;
				if(successfulLoopCounter==11 || successfulLoopCounter==12 || successfulLoopCounter==13)
					System.out.println(successfulLoopCounter+"th number is: "+loopCounter);
				else if(successfulLoopCounter==1 || successfulLoopCounter%10==1)
					System.out.println(successfulLoopCounter+"st number is: "+loopCounter);
				else if(successfulLoopCounter==2 || successfulLoopCounter%10==2)
					System.out.println(successfulLoopCounter+"nd number is: "+loopCounter);
				else if(successfulLoopCounter==3 || successfulLoopCounter%10==3)
					System.out.println(successfulLoopCounter+"rd number is: "+loopCounter);
				else
					System.out.println(successfulLoopCounter+"th number is: "+loopCounter);
			}
			
			loopCounter++;
//			else
//			{
//				loopCounter++;
//				continue;
//			}
		}
	}
}
