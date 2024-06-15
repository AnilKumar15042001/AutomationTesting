package Java_Automation;

import java.util.Scanner;

public class Count_NumberOfDigits {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("Enter a number:");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			n=n/10;
			count=count+1;
		}
		System.out.println("Number of digits are:"+count);
	}

}
