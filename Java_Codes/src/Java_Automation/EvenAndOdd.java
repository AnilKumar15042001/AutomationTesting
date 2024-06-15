package Java_Automation;

import java.util.Scanner;

public class EvenAndOdd {
//logic1:-using Brute-force
	public void logic1(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
	//logic2:-using ternary operator
	public void logic2(int n)
	{
		if(n<=0)
		{
			System.out.println("Invalid number:"+n);
		}
		else
		{
			String value=n%2==0?"is even":"is odd";
			System.out.println(n+value);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
		EvenAndOdd eo=new EvenAndOdd();
		eo.logic2(s.nextInt());
	}

}
