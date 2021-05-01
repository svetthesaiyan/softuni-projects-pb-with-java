package for_loop_lab;

import java.util.Scanner;

public class f_vowels_sum {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a piece of text: ");
		String text=scanner.nextLine();
		int sum=0;
		
		for(int position=0; position<=text.length()-1; position++)
		{
			char letter=(text.charAt(position));
			
			switch(letter)
			{
				case 'a':
					sum+=1;
					break;
					
				case 'e':
					sum+=2;
					break;
					
				case 'i':
					sum+=3;
					break;
					
				case 'o':
					sum+=4;
					break;
					
				case 'u':
					sum+=5;
					break;
					
			}
		}
		System.out.println("The syllabic sum of the word \""+text+"\" according to our points system is: "+sum);
	}

}
