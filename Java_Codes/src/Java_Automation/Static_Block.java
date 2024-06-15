package Java_Automation;

public class Static_Block {
	
	static { //JVM considered highest priority of static block as possible to the static method(main method)
		System.out.println("first Static block executed");
	}

	public static void main(String[] args) {  
		
		System.out.println("main method executed");
	}

}
