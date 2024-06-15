package Java_Automation;
import java.util.Scanner;
public class Swap { //swap without using third variable
public void swap(int a,int b) {
	System.out.println("Before swapping a & b value is:"+a+" "+b);
	//logic-1:-using 3rd variable
	int c=a;
	    a=b;
	    b=c;
	    
		 //logic-2:-use + & - operator(without using 3rd variable)
		/*	a=a+b; //a=10+20=30 , a value =30
			b=a-b; //b=30-20=10 , current value of b=10
			a=a-b; //a=30-10=20 , current value of a=20
			*/
			
		 //logic-3:-use * & / operator(without using 3rd variable)
		 //a & b value should not be 0
		/*	a=a*b; //a=10*20=200
			b=a/b; //b=200/20=10  , current value of b=10
			a=a/b; //a=200/10=20  , current value of a=20
			*/
			
		 //logic-4:-using bitwise XOR(^) operator
		/*	a=a^b; //a=10^20=30
			b=a^b; //b=30^20=10  , current value of b=10
			a=a^b; //a=30^10=20  , current value of a=20
			*/
			
		 //logic-5:-single statement
		/*	b=a+b-(a=b); //b=10+20-(10=20)   b value assign to a
			             //b=30-20=10  
			 */
	    System.out.println("After swapping a & b value is:"+a+" "+b);
}
	public static void main(String[] args) {

        Swap obj=new Swap();
        obj.swap(10, 20);
        
	}

}
