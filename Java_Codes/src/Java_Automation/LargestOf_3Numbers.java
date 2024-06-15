package Java_Automation;
import java.util.Scanner;
public class LargestOf_3Numbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a value:");
		a=s.nextInt();
		System.out.print("Enter b value:");
		b=s.nextInt();
		System.out.print("Enter c value:");
		c=s.nextInt();
		//Logic-1:-using else-if condition & logic
		/*if(a>b && a>c)
		{
		   System.out.println(a+" is largest");
	    }
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest");
		}
		else
		{
			System.out.println(c+" is largest");
		}
		*/
		
		//logic-2:-using ternary operator
		
		//int largest1=a>b?a:b;
		//int largest2=c>largest1?c:largest;
		int largest=c>(a>b?a:b)?c:(a>b?a:b); //single statement
		System.out.println(largest+" is largest");
}
}