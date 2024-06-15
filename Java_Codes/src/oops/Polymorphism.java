package oops;

public class Polymorphism {

	int a=10;
	int b=20;
	void add()
	{
		System.out.println(a+b);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void add(int a,float f)
	{
		System.out.println(a+f);
	}
	void add(float f,int a)
	{
		System.out.println(f+a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism pm=new Polymorphism();
		pm.add(10, 20.5f);
		pm.add(10.2f, 203);
		pm.add(10,20,30);
	}

}
