package Java_Automation;

class A{
	int a=10,b=20;
	public void add()
	{
		System.out.println(a+b);
	}
	
}
class B extends A{
	public void sub()
	{
		System.out.println(a-b);
	}
}
class C extends B{
	public void multi()
	{
		System.out.println(a*b);
	}
}
class D extends C{
	public void div()
	{
		System.out.println(a/b);
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
	
		D obj=new D();
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
	}

}
