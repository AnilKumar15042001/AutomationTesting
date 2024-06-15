package Java_Automation;

import java.util.Scanner;

public class PrimeNumberArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int x:arr)
		{
			int count=0;
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(x+" is prime number");
			}
			else
			{
				System.out.println(x+" is not prime number");
			}
		}
		
		
	}

}
