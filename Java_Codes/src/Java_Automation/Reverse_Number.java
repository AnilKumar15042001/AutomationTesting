package Java_Automation;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int n,r,rev=0;
		System.out.println("Enter A number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		//logic-1:-using algorithm
	/*	while(n>0)
		{
			r=n%10;
			rev=r+(rev*10);
			n=n/10;
		}
		*/
	/*	while(n>0)
		{
			rev=n%10+rev*10;
			n=n/10;
		}
		System.out.println("Reverse Number Is:"+rev);
		*/
		
		//logic-2:-using StringBuffer Class
	/*  StringBuffer reverse;
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		reverse=sb.reverse();
		System.out.println("Reverse Number Is:"+reverse);
		*/
		
		//logic-3:-using StringBuilder class
		StringBuilder rev1;
		StringBuilder sbl=new StringBuilder();
		sbl.append(n);
		rev1=sbl.reverse();
		System.out.println("Reverse Number Is:"+rev1);
		
	}

}
