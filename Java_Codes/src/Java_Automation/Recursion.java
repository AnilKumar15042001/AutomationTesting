package Java_Automation;

public class Recursion {

	static int n=0;
	static int r()
	{
		n++;
		if(n<=5)
		{
			System.out.println(n);	
			return r();
		}
		else
		{
			System.out.println(n);
			return n;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		r();
	}

}
