package exceptionHandling;

import java.io.IOException;

public class CheckedPropagation {

//	By default, Checked Exceptions are not forwarded in calling chain (propagated)
	void m()
	{
		throw new java.io.IOException("this is checked exception");
	}
	void n()
	{
		m();
	}
	void x()
	{
		try
		{
			n();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		CheckedPropagation obj=new CheckedPropagation();
		obj.x();
		System.out.println("success");
	}
}
