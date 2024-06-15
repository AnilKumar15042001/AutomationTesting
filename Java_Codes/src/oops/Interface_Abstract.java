package oops;

interface Interface{
	
	void show();
	void display();
	void print();
}

abstract class Abstract implements Interface{
	
	 public void show()
	{
		System.out.println("Show method is executed");
	}
}

public class Interface_Abstract extends Abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract ia=new Interface_Abstract();
		
		ia.show();
		ia.display();
		ia.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Display method is executed");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Print method is executed");
	}

}
