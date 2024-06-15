package Java_Automation;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" position array value:");
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter searching number:");
		
		int findingNumber=s.nextInt();
		
		boolean b=false;
		
		for(int x:a)
		{
			if(x==findingNumber)
			{
				System.out.println("The number is present in array:"+x);
				b=true;
				break;
			}
		}
		if(b==false)
		{
			System.out.println("The number is not present in array:"+findingNumber);
		}
	}

}
