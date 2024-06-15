package Java_Automation;
                           //***Default Constructor***//
/*class Default{
	int a,b;   //if you not add the value of a & b
	Default()  //By default java add value of a=0 & b=0 
	{
		int a=15;
		int b=20;
		System.out.println(a+b);
	}
	void display()
	{
		System.out.println(a+""+b);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Default obj=new Default();
		obj.display();
	}
}*/
//***Parameterized Constructor
/*class Parameter{
	int x,y;
	Parameter(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}
	Parameter(int a,String s)
	{
		System.out.println(a+s);
	}
	void show(int c,int d)
	{
		System.out.println(x+" "+y);
		System.out.println(c+d);
	}
}
public class Constructor{
	public static void main(String[] args) {
		Parameter p=new Parameter(10,20);
		Parameter obj=new Parameter(10,"anil");
		p.show(20,30);
	}
}*/
               //***Copy Constructor***//
/*class Copy{
	int x;String s;
	Copy(int a,String b)
	{
		x=a;
		s=b;
	}
	Copy(Copy y)
	{
		int n=y.x;
		String s1=y.s;
		System.out.println(n+" "+s1);
	}
	void show()
	{
		System.out.println(x+" "+s);
	}
}
public class Constructor
{
	public static void main(String[] args) {
		Copy c=new Copy(20,"anil");
		Copy c1=new Copy(c);
		c.show();
	}
}*/

public class Constructor
{
     Constructor(int a,int b)
	{
		System.out.println(a+b);
	}
	Constructor()
	{
		this(10,20);
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
	}
}