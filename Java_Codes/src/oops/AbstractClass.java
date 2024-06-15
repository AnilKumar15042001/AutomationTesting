package oops;

abstract class Abstraction{
	
	abstract void show();
	
	void display() {
		
		System.out.println("Display method executed");
	}
}

public class AbstractClass extends Abstraction{
	
	@Override
	void show()
	{
		System.out.println("Show method executed");
	}

	public static void main(String[] args) {
		
		Abstraction ab=new AbstractClass();
		
		ab.show();
		ab.display();
	}

}
