package array_ArrayList;
import java.util.Scanner;

import array_ArrayList.Array16;
public class C {

	public static void main(String[] args) {
		
//		B obj=new B();
//	    System.out.println(obj.);
//		obj.b();
//		System.out.println(Array16.array16());
		System.out.println("Enter numbers");
		Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		int sum=0;
		int temp=0;
		
		
		for(int i=0;i<q;i++)
		{
			
			int a=s.nextInt();
			int b=s.nextInt();
			int n=s.nextInt();
			
			for(int j=0;j<n;j++)
			{
				sum=(int) (sum+(a+Math.pow(2, j)*b));
				System.out.println(sum);
			}
			
			a=s.nextInt();
		     b=s.nextInt();
			 n=s.nextInt();
			for(int k=0;k<n;k++)
			{
				temp=(int) (temp+(a+Math.pow(2, k)*b));
				System.out.println(temp);
			}
			
		}
		
		
	}
}
//package array_ArrayList;

// class A {
//
//	int a=10;
//}
//  class B {
//
//		public void b()
//		{
//			A ref=new A();
//			int c=ref.a;
//			System.out.println("print b"+c);
//		}
//
//		
//	}

