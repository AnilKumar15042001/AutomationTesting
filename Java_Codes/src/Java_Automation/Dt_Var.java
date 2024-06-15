package Java_Automation;

public class Dt_Var { //Dt_Var is Data type and Variable
	int b=20; //instance variable
	static int c=30; //static variable
    public void first() {
      //Dt var vv
    	int a=10; //local variable
    	System.out.println(a+" "+"First method executed!...");
    }
    public void second() {
    	System.out.println(b+" "+"Second method executed!...");
    	System.out.println(c+" c is static variable");
    }
    public void third() {
    	System.out.println(c+" "+"Third method executed!...");
    }
	public static void main(String[] args) {
		
		System.out.println(c+" "+"Main Method Executed!...");
		Dt_Var x=new Dt_Var();
		x.first();
		x.second();
		x.third();
	}

}
