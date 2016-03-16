/*Class exercise 3.2
Daryl Jones
*/
import java.util.Scanner;
public class Rectangle {
	//perimeter and area of a rectangle
	public static void main(String [] args)  {

	Scanner input = new Scanner(System.in);
	 
	//variables
	int length = 0;
	int width = 0;
	int area = 0;
	int perimeter = 0;
	//prompt
	System.out.println("Enter the length of a rectangle : \n");
	length = input.nextInt();
	System.out.println("Enter the width of a rectangle : \n");
	width = input.nextInt();
	
	area = length * width;
	perimeter = 2 * (length + width);
	
	System.out.println("The area of the rectangle is : " + area);
	System.out.println("The perimeter of the rectangle is : " + perimeter);




}
}
