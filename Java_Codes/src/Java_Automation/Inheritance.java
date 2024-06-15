package Java_Automation;

class Super1{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
}
class Sub1 extends Super1{
	void sub(int a,int b)
	{
		int d=a-b;
		System.out.println(d);
	}
}
public class Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub1 sb=new Sub1();
		sb.add(10, 20);
		sb.sub(20, 10);
	}

}
