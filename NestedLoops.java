public class NestedLoops {//1
	public static void main(String[] args) {//2
	//Heading
	System.out.println("          Multiplication Table");
	//Number title
	System.out.print("  | ");
	for (int j = 1; j <= 20; j++)
		System.out.printf("%5d",  j);
	System.out.println("\n________________________________________________________________________________________________________");

	//Table body
	for (int i = 1; i <= 20; i++) {//3
		System.out.print(i + " ");
		for (int j = 1; j <= 20; j++)  {//4
	//Display and align
	System.out.printf(" %5d", i * j);
	}//1
	System.out.println();
	}//2
	}//3
	}//4
	
