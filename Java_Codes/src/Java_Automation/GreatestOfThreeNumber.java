package Java_Automation;

import java.util.Scanner;

public class GreatestOfThreeNumber {
//Find the Greatest Number Among Three Numbers in Java
	
	//logic1:-using if else statements
	public void logic1(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	//logic2:-using ternary operator
	public void logic2(int a,int b,int c)
	{
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a,b & c value:");
		Scanner s=new Scanner(System.in);
		GreatestOfThreeNumber gn=new GreatestOfThreeNumber();
		gn.logic2(s.nextInt(), s.nextInt(), s.nextInt());
	}

}
