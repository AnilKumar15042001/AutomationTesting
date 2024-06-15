package Java_Automation;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count=count+1;
		}
		if(count==2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
