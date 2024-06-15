package Java_Automation;

import java.io.PrintStream;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int arr[]= {1,2,3,4,5};
		try{
			System.out.println("Before Exception occur"); //if exception occur or not it will be execute
//			int c=a/b;//Exception occur
			System.out.println(arr[10]);
			System.out.println("After Exception occur"); //if exception occur then after exception statements not executed
		}
		catch(ArrayIndexOutOfBoundsException x)//if exception is occured then it will be execute otherwise it is not execute
		{
//			System.out.println(a/2);
//			int d=a/b;
			System.out.println("Main problem is:"+x.getMessage());
		}
		System.out.println("Rest of code");
	}
}
