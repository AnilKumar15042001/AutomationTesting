package Java_Automation;

import java.util.Scanner;

public class CountSumOfDigits_In_A_Number {

	public static void main(String[] args) {
		
		int n,sum=0,r;
		System.out.println("Enter a Number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits in a number:"+sum);
	}

}
