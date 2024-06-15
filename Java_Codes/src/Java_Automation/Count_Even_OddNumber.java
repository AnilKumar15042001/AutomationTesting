package Java_Automation;

import java.util.Scanner;

public class Count_Even_OddNumber {

	public static void main(String[] args) {
		int n,even_count=0,odd_count=0,r;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			
			if(r%2==0)
			{
				System.out.println("Even digits are:"+r);
				even_count++;
			}
			else
			{
				System.out.println("Odd digits are:"+r);
				odd_count++;
			}
			n=n/10;
		}
		System.out.println("Total even digits are:"+even_count);
		System.out.println("Total odd digits are:"+odd_count);
		
	}

}
