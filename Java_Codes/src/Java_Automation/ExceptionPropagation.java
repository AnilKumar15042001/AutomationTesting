package Java_Automation;

public class ExceptionPropagation {

	void a()
	{
		int n=10/0;
	}
	void b()
	{
		a();
	}
	void c()
	{
		try
		{
			b();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionPropagation obj=new ExceptionPropagation();
		obj.c();
		System.out.println("Rest of code");
	}

}
