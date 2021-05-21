package nested_loops_lab;

import java.util.Scanner;

public class f_building 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int floorsTotal=Integer.parseInt(scanner.nextLine());
		int roomsPerFloor=Integer.parseInt(scanner.nextLine());
		
		for(int floor=floorsTotal; floor>=1; floor--)
		{
			for(int room=0; room<roomsPerFloor; room++)
			{
//				if(floor%2==0 && floor!=floorsTotal) // само офиси на този етаж
//					System.out.print("O"+floor+room+" ");
//				else // само апартаменти на този етаж
//				{
//					if(floor==floorsTotal || floorsTotal==1)
//						System.out.print("L"+floor+room+" ");
//					else
//						System.out.print("A"+floor+room+" ");
//				}
				// ето така също става
				if(floor==floorsTotal)
					System.out.print("L"+floor+room+" ");
				else if(floor%2==0)
					System.out.print("O"+floor+room+" ");
				else
					System.out.print("A"+floor+room+" ");
			}
			System.out.println();
		}
	}
}
