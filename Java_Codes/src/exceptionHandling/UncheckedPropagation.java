package exceptionHandling;

public class UncheckedPropagation {

//	By default Unchecked Exceptions are forwarded in calling chain (propagated)
	
	void m()
	{
		int num=50/0;
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
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		UncheckedPropagation obj=new UncheckedPropagation();
		obj.x();
		System.out.println("success");
	}
}
