package while_loop_exercise;

import java.util.Scanner;

public class a_grandma_library 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the book you're looking for: ");
		String favouriteBook=scanner.nextLine();
		
		int bookCounter=0;
		boolean isFavouriteBookFound=false;
		
		System.out.println("Now start looking for the book."+"\n"+"If you give up, I'll tell you just how persistent you were.");
		String nextBook=scanner.nextLine();
		while(!nextBook.equalsIgnoreCase("No More Books"))
		{
			if(nextBook.equals(favouriteBook))
			{
				isFavouriteBookFound=true;
				break;
			}
			bookCounter++;
			
			nextBook=scanner.nextLine();
		}
		
		System.out.println();
		if(isFavouriteBookFound)
			System.out.print("You checked "+bookCounter+" books and eventually ended up finding the book you were looking for!"+"\n"+"Congratulations on not giving up. 😉");
		else
			System.out.print("The book you're looking for is either missing or you gave up too early and didn't find it."+"\n"+"Nevertheless, you checked "+bookCounter+" books so you can't say you didn't try. 🤗");
	}
}
