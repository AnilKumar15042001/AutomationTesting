package exceptionHandling;

public class Nested_TryBlock {

	public static void main(String[] args) {
		
		try {
//			String str=null;
//			System.out.println(str.length());
			try {
//				int arr[]=new int[5];
//				arr[10]=10;
				try {
					 int data=50/0;
					
				 }
				catch(ArithmeticException e)
				{
					System.out.println(e.getMessage());
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Executed");
	}
}
