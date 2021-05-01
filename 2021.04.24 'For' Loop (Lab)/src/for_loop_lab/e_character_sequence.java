package for_loop_lab;

import java.util.Scanner;

public class e_character_sequence 
{
	public static void main(String[] args) 
	{
/*		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.length());
		System.out.println(text.charAt(text.length()-1));
 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a piece of text: ");
		String text=scanner.nextLine();
		
		System.out.println("Here's the text you entered but every symbol is on a different line:");
		
		for(int position=0; position<=text.length()-1; position++) // стойностите на символите на променлива от тип "String" почват от 0 и затова сме добавили "-1" към командата "text.length()" 
			System.out.println(text.charAt(position));
	}
}
