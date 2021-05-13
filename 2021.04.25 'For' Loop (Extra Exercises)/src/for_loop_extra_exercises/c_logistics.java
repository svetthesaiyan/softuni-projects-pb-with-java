package for_loop_extra_exercises;

import java.util.Scanner;

public class c_logistics 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of cargo being transported: ");
		int cargoAmount=Integer.parseInt(scanner.nextLine());
		
		int cargoWeightTotal=0;
		
		double vanTransportationPrice  =0;
		double truckTransportationPrice=0;
		double trainTransportationPrice=0;
		
		double cargoWeightVanPercent  =0;
		double cargoWeightTruckPercent=0;
		double cargoWeightTrainPercent=0;
		
		for(int i=1; i<=cargoAmount; i++)
		{
			System.out.print("Enter the weight of cargo №"+i+" in tonnes: ");
			int cargoWeight=Integer.parseInt(scanner.nextLine());
			cargoWeightTotal+=cargoWeight;
			
			if(cargoWeight<=3)
			{
				vanTransportationPrice  +=cargoWeight*200;
				cargoWeightVanPercent   +=cargoWeight;
			}
			else if(cargoWeight>=4 && cargoWeight<=11)
			{
				truckTransportationPrice+=cargoWeight*175;
				cargoWeightTruckPercent +=cargoWeight;
			}
			else if(cargoWeight>=12)
			{
				trainTransportationPrice+=cargoWeight*120;
				cargoWeightTrainPercent +=cargoWeight;
			}
		}
		
		System.out.println();
		double averageTransportationPricePerTonne=(vanTransportationPrice+truckTransportationPrice+trainTransportationPrice)/cargoWeightTotal;
		
		cargoWeightVanPercent  =(cargoWeightVanPercent/cargoWeightTotal)  *100;
		cargoWeightTruckPercent=(cargoWeightTruckPercent/cargoWeightTotal)*100;
		cargoWeightTrainPercent=(cargoWeightTrainPercent/cargoWeightTotal)*100;
		
		System.out.printf("The average trasportation price per tonne for the designated cargo is %.2f lv." +"\n", averageTransportationPricePerTonne);
		System.out.printf("The weight percentage of the cargo that's being trasported by van is %.2f%%"+"\n"    , cargoWeightVanPercent);
		System.out.printf("The weight percentage of the cargo that's being trasported by truck is %.2f%%"+"\n"  , cargoWeightTruckPercent);
		System.out.printf("The weight percentage of the cargo that's being trasported by train is %.2f%%"       , cargoWeightTrainPercent);
	}
}
