package Java_Automation;

import java.util.Scanner;

public class Reverse_Number1 {
	
public void reverse(int n) {
	int r,rev=0;
	while(n>0)
	{
		r=n%10;
		rev=r+(rev*10);
		n=n/10;
	}
	System.out.println("Reverse number is: "+rev);
	
}

	public static void main(String[] args) {
		Reverse_Number1 obj=new Reverse_Number1();
		obj.reverse(123);

	}

}
