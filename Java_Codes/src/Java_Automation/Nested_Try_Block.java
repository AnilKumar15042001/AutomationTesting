package Java_Automation;

public class Nested_Try_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			try
			{
				int a=10/0;	
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException occurs:"+ae.getMessage());
				
			}
			try
			{
				int a[]=new int[5];
				a[5]=10;
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("ArrayIndexOutOfBoundsException occurs:"+aie.getMessage());
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
		finally
		{
			System.out.println("Finally should be executed");
		}
	}

}
