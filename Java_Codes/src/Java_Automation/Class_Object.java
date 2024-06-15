package Java_Automation;

public class Class_Object {
    
	int age =23;
	String name="Anil";
	String color="Black";
	void age()
	{
		System.out.println("age:"+age);
	}
	void name()
	{
		System.out.println("name:"+name);
	}
	void color()
	{
		System.out.println("color:"+color);
	}
	public static void main(String[] args) {
		Class_Object co=new Class_Object();
		System.out.println(co.age);
		System.out.println(co.name);
		System.out.println(co.color);
		co.age();
		co.name();
		co.color();
	}
}
