package Java_Automation;

public class Static_Method {
static int a=10;
public static void a() {
	int b=20;
	System.out.println("Static Method Executed!..."); //it will access the variable inside the and using static keyword 
	System.out.println(a+" "+b);
}
	public static void main(String[] args) { //Main method is a static method and it is already define by java language
		Static_Method.a(); //Calling the static method using"class name And Method name"
	}

}
