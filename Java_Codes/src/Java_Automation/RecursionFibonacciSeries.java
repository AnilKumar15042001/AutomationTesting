package Java_Automation;

public class RecursionFibonacciSeries {

	static int n1=0,n2=1,n3=0;
	public static int fibonacci(int n)
	{
		if(n>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3+" ");
			fibonacci(n-1);
		}
		return n3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		System.out.print(n1+" "+n2);
		System.out.println(fibonacci(n-2));
	}

}
