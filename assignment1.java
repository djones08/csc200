/*Daryl Jones
Extra Credit 1
it took me a long time to figure out.
*/

import java.util.Scanner;
public class assignment1
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	int age;
	//String name = keyboard.nextLine();
	System.out.println("Enter your age.");
	age = keyboard.nextInt();
	System.out.println("Enter your full name.");
	String name = keyboard.nextLine();
	name = keyboard.nextLine();
	name = name.toUpperCase();
	System.out.println("Your name in uppercase is " + name +
	" and you are " + age + " years old.");
}
}

