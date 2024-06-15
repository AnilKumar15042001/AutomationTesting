package array_ArrayList;

import java.util.Scanner;

public class Array_1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//logic-1
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[2]);
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		//logic-2
		int b[]= {100,200,300,400,500};
		System.out.println();
		System.out.println(b[2]);
		int sum=0;
		for(int j:b)
		{
			System.out.print(j+" ");
			sum=sum+j;
		}
		System.out.println();
		System.out.println(sum);
		
		//logic-3
		Object c[]=new Object[5];
		c[0]=10;
		c[1]='c';
		c[2]=10.23;
		c[3]="String";
		c[4]=true;
		for(Object k:c)
		{
			System.out.print(k+" ");
		}
		
		//logic-4
		System.out.println();
		System.out.println("Enter array value:");
		Scanner s=new Scanner(System.in);
		
		int d[]=new int[5];
		for(int l=0;l<5;l++)
		{
			d[l]=s.nextInt();
			
		}
		
	}

}
