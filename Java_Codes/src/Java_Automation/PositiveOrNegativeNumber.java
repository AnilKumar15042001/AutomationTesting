package Java_Automation;

import java.util.Scanner;
                                    //Check if a Number is Positive or Negative in Java
public class PositiveOrNegativeNumber {
	//logic1:-using Brute-force method
	public void logic1(int n)
	{
		if(n>0)
		{
			System.out.println(n+" is a positive number");
		}
		else if(n<0)
		{
			System.out.println(n+" is a  negative number");
		}
		else
		{
			System.out.println("The number is="+n);
		}
	}
	//logic2:-using nested if-else 
	public void logic2(int n)
	{
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println(n+" is positive number");
			}
			else
			{
				System.out.println(n+" is negative number");
			}
		}
		else
		{
			System.out.println("The number is="+n);
		}
	}
	//logic3:-using ternary operator
	public void logic3(int n)
	{
		if(n==0)
		{
			System.out.println("The number is="+n);
		}
		else
		{
			String value=n>0?"The number is positive":"The number is negative";
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		PositiveOrNegativeNumber pn=new PositiveOrNegativeNumber();
		pn.logic3(s.nextInt());
	}

}
