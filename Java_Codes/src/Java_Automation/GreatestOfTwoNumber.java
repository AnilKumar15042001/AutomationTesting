package Java_Automation;

import java.util.Scanner;

public class GreatestOfTwoNumber {
//Java Program to Find Greatest of Two Numbers
	
	//logic1:-Using if-else Statements
	public void logic1(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greatest");
		}
		else
		{
			System.out.println(b+" is greatest");
		}
	}
	//logic2:-Using Ternary Operator
	public void logic2(int a,int b)
	{
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			int value=a>b?a:b;
			System.out.println(value);
		}
	}
	//logic3:-Using inbuilt max Function
	public void logic3(int a,int b)
	{
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println(Math.max(a, b));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a & b value:");
		Scanner s=new Scanner(System.in);
		GreatestOfTwoNumber gn=new GreatestOfTwoNumber();
		gn.logic3(s.nextInt(), s.nextInt());
	}

}
