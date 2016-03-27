/*Daryl Jones
class exercise 3.3
*/
/**username and password*/
//import scanner
import java.util.Scanner;

public class FlowchartPseudocode
{//1
public static void main(String [] args) 
{//2
	Scanner input = new Scanner(System.in);
	//inputs
	String user = "Daryl";

	String pass = "Jones";

	System.out.print("Enter your username: ");
	user = input.nextLine();
	
	System.out.print("Enter your password: ");
	pass = input.nextLine();

	//if statement
	if(user.equals("Daryl") && (pass.equals("Jones")))
{//4
	System.out.println("Welcome Daryl!!");
}//4
	//else statement
	else{//5
	System.out.println("Wrong Username or Password!");
	
}//5
}//1
}//2

