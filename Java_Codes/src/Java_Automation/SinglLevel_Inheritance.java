package Java_Automation;
//single level inheritance
class SLI{
	public void a()
	{
		int a=10,b=20;
		 System.out.println(a+b);
	}
}
public class SinglLevel_Inheritance extends SLI  {

	public static void main(String[] args) {
		SinglLevel_Inheritance obj=new SinglLevel_Inheritance();
		obj.a();
	}

}
