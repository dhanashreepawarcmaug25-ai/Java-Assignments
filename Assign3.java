//To Check Even or Odd
import java.util.*;

class Assign3 {
	
	public static void main(String args[]){
		System.out.println("Check Even or Odd..");
		
		int n=25;
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num%2==0){
			System.out.println("Even number..");
		}
		
		else{
			System.out.println(num + " is Odd number..");
		}
			
	}
	
}

/*
OUTPUT
C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>javac Assign3.java

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign3
Check Even or Odd..
25
25 is Odd number..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>java Assign3
Check Even or Odd..
200
Even number..

C:\Users\Lenovo\OneDrive\Desktop\JAVA\JavaAssignments>
*/