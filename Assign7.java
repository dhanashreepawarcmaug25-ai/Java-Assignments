//Greatest of 3 numbers
import java.util.Scanner;

class Assign7
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of A : ");
		a=sc.nextInt();
		System.out.print("Enter value of B : ");
		b=sc.nextInt();
		System.out.print("Enter value of C : ");
		c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.println(a+ " is Greater..");
		}
		
		else if(b>a && b>c){
			System.out.println(b+ " is Greater..");
		}
		
		else{
			System.out.println(c+ " is Greater..");
		}
	}
}

/*
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>javac Assign7.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign7
Enter value of A : 10
Enter value of B : 20
Enter value of C : 30
30 is Greater..
*/