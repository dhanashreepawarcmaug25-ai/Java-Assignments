//To check the number is positive or not
import java.util.*;

class Assign1
{
	
	public static void main(String args[])
	{
		
		System.out.println("Check positive");
		int n;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		
		if(n>0) {
			System.out.println("Number is Positive..");			
		}
		
		else if(n==0) {
			System.out.println("Number is Zero..");
		}
		
		else {
			System.out.println("Number is Negative..");
		}
		
	}
}

/*
OUTPUT

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>javac Assign1.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign1
Check positive
12
Number is Positive..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign1
Check positive
0
Number is Zero..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign1
Check positive
-1
Number is Negative..

*/