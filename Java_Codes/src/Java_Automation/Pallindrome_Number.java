package Java_Automation;

import java.util.Scanner;

public class Pallindrome_Number {

	public static void main(String[] args) {
		int n,r,c,sum=0;
		System.out.println("Enter a three digit number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			sum=r+(sum*10);
			n=n/10;
		}
		if(sum==c) 
		{
			System.out.println(sum+" is a Pallindrome number");
		}
		else
		{
			System.out.println(sum+" is not a pallindrome number");
		}

	}

}
