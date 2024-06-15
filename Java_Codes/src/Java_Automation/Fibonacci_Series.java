package Java_Automation;

public class Fibonacci_Series {

	public static void main(String[] args) {
		//fibonacci series without using recursion
	  /* int n1=0,n2=1,n3,i=1;
	   	while(i<=10) 
		{
			System.out.println(n1+"");
			n3=n2+n1;
			n1=n2;
			n2=n3;
			i++;
		}*/
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) //using for loop
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}

	}

}
