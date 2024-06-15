package Java_Automation;

import java.util.Scanner;

public class RecursionFactorialNumber {

	int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		RecursionFactorialNumber obj=new RecursionFactorialNumber();
		Scanner s=new Scanner(System.in);
		int a=obj.factorial(s.nextInt());
		System.out.println(a);
		//System.out.println(obj.factorial(s.nextInt()));
	}
}
