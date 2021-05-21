package nested_loops_lab;

public class b_multiplication_table 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=10; x++)
		{
			for(int y=1; y<=10; y++)
			{
				System.out.println(x+"*"+y+"="+(x*y));
			}
		}
	}
}
