package while_loop_extra_exercises;

import java.util.*;
import java.util.Scanner;

public class c_letter_stream 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		// start 65 - A -> (+32) = 97 - a
        // end 90 - Z -> (+32) = 122 - z
 
        // Creating lists one to store the special characters
        List<Character> specialCharsList=new ArrayList<>(List.of('c', 'o', 'n'));
        // One to modify (delete them when we don't need them, and adding them back)
        List<Character> tempList=new ArrayList<>(specialCharsList);
 
        // The main list
        List<Character> charsList=new ArrayList<>();
 
        int specialCharsCount=0;
 
        // The input and filtering (adding space after the special characters)
        String current=scanner.nextLine();
        while (!current.equals("End")) 
        {
            char temp=' ';
            for (int i=0; i<tempList.size(); i++) 
            {
                if (current.equals(tempList.get(i).toString())) 
                {
                    specialCharsCount++;
                    tempList.remove(i);
 
                    temp = Character.MIN_VALUE;
                    break;
                }
            }
 
            if (specialCharsCount==3) 
            {
                charsList.add(' ');
                specialCharsCount=0;
                tempList=new ArrayList<>(specialCharsList);
            }
 
            if (temp==' ')
                charsList.add(current.charAt(0));
            else
                charsList.add(temp);
 
            current=scanner.nextLine();
        }
 
        // ASCII symbols, well the ones we are sure are gonna be used
        List<Character> symbolsList=new ArrayList<>();
        for (int i=33; i<=126; i++)
        {
            if ((i>=65 && i<=90) || (i>=97 && i<=122))
                continue;
 
            char currentChar=(char) i;
            symbolsList.add(currentChar);
        }
 
        StringBuilder finalResult=new StringBuilder();
 
        // foreach!! but uglier
        for (Character character : charsList) 
        {
            if (symbolsList.contains(character))
                continue;
 
            finalResult.append(character.toString());
        }
 
        // Finding the last spacebar, hence the last word
        int spacebarIndex=0;
        for (int i=0; i<finalResult.length(); i++)
        {
            if(finalResult.charAt(i)==' ')
                spacebarIndex = i;
        }
 
        // removeAt equivalent
        finalResult.delete(spacebarIndex+1, finalResult.length());
        System.out.println(finalResult);
	}
}
