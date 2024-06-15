package Java_Automation;
class Super
{
	int a=20;
	Super()
	{
		System.out.println("Anil");
	}
	Super(int x)
	{
		System.out.println(x);
	}
	void disp()
	{
		System.out.println("hello");
	}
}
class Sub extends Super
{
	int a=10;
	Sub()
	{
		System.out.println("Kumar");//In Default Constructor case no need to write "Super" keyword 
		                            //By default java compiler add the super keyword
	}
	Sub(int y)                       
	{
		super(10);
		System.out.println(y);//In Parameterized constructor case we can write the "super" keyword
		                      //By default java compiler not add
	}
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	void disp()
	{
		super.disp();
		System.out.println("world");
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Sub s1=new  Sub();
		Sub s=new Sub(20);
		s.show();
		s.disp();
	}
}
