package Java_Automation;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		

		int n,fact=1;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		/*for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}*/
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
