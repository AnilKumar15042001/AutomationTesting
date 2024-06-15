package Java_Automation;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int n,r,c,sum=0;
		System.out.println("Enter a three digit number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(sum==c)
		{
			System.out.println(sum+" is a armstrong number");
		}
		else
		{
			System.out.println(sum+" is not a armstrong number");
		}

	}

}
