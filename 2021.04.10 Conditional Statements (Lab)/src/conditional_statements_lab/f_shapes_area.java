package conditional_statements_lab;
 
import java.util.Scanner;
 
public class f_shapes_area 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the shape whose area you'd like to calculate: ");
        String input=scanner.nextLine();
        
        if(input.equalsIgnoreCase("square"))
        {
            System.out.print("Please enter the length of your square's side: ");
            double squareSide=Double.parseDouble(scanner.nextLine());
            System.out.println();
            
            double squareArea=Math.pow(squareSide, 2);
            System.out.printf("The area of your square is: %.3f", squareArea);
        }
        else if(input.equalsIgnoreCase("rectangle"))
        {
            System.out.print("Please enter the length of your rectangle: ");
            double rectangleLength=Double.parseDouble(scanner.nextLine());
            System.out.print("Please enter the width of your rectangle: ");
            double rectangleWidth=Double.parseDouble(scanner.nextLine());
            
            double rectangleArea=rectangleLength*rectangleWidth;
            System.out.printf("The area of your rectangle is: %.3f", rectangleArea);
        }
        else if(input.equalsIgnoreCase("circle"))
        {
            System.out.print("Please enter the radius of your circle: ");
            double circleRadius=Double.parseDouble(scanner.nextLine());
            
            double circleArea=Math.PI*circleRadius*circleRadius;
            System.out.printf("The area of you circle is: %.3f", circleArea);
        }
        else
        {
            System.out.print("Please enter the length of your triangle's side: ");
            double triangleSide=Double.parseDouble(scanner.nextLine());
            System.out.print("Please enter the height of your triangle: ");
            double triangleHeight=Double.parseDouble(scanner.nextLine());
            
            double triangleArea=triangleSide*triangleHeight/2;
            System.out.printf("The area of your triangle is: %.3f", triangleArea);
        }
    }
}