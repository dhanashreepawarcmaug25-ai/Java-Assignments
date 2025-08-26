//Area of square
import java.util.Scanner;

public class Assign5{
	
	public static void main(String args[])
	{
		int side;
		System.out.println("Enter the side of Square: ");
		Scanner sc = new Scanner(System.in);
		
		side = sc.nextInt();
		
		float area;
		area = side*side;
		
		System.out.println("Area is : "+ area);
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>javac Assign5.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign5
Enter the side of Square:
12
Area is : 144.0

*/