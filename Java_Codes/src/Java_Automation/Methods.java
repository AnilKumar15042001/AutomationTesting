package Java_Automation;

public class Methods {
	
	public void m1()
	{
		System.out.println("M1 Shouuld Be Displayed!...");
	}
	public void m2()
	{
		System.out.println("M2 Should Be Displayed!...");
	}
	public void m3()
	{
		System.out.println("M3 Should Be Displayed!...");
	}

	public static void main(String[] args) {
	System.out.println("Main Method Should Be Executed!...");
	Methods obj=new Methods();
	obj.m1();
	obj.m2();
	obj.m3();
	}
}