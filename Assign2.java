//To Check if a number is negative
import java.util.*;

class Assign2
{
	
	public static void main(String args[])
	{
		
		System.out.println("Check Negative");
		int n;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Number is Negative..");			
		}		
		else if (n==0) {
			System.out.println("Number is Zero..");
		}
		else {
			System.out.println("Number is Positive..");
		}
		
	}
}

/*
OUTPUT
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>javac Assign2.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign2
Check Negative
-5
Number is Negative..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign2
Check Negative
12
Number is Positive..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign2
Check Negative
0
Number is Zero..

*/