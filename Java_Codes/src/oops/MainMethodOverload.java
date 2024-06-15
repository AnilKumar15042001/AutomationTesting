package oops;

public class MainMethodOverload {

	public static void main(int arr,boolean b)
	{
		
	}
	public static void main(String str)
	{
		System.out.println(str);
	}
	public static int main(int a,int b)
	{
		return a+b;
	}
	static public void main(int b)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=main(10,20);
		System.out.println(a);
		main("Anil");
		
	}

}
