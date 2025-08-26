//Area of Rectangle
import java.util.Scanner;

public class Assign6
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int length,breadth;
		
		System.out.println("Enter the length: ");
		length=sc.nextInt();
		
		System.out.println("Enter the breadth: ");
		breadth=sc.nextInt();
		
		//float area;
		//area=0.5*length*breadth;   - [0.5f should be written otherwise it causes error : lossy conversion]
		/*
		error: incompatible types: possible lossy conversion from double to float
                area=0.5*length*breadth;
                               ^
		1 error
		*/
		double area;
		area=0.5*length*breadth;
		
		System.out.println("Area of Rectangle : " + area);
		
	}
	
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign6
Enter the length:
5
Enter the breadth:
4
Area of Rectangle : 10.0
*/