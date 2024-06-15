package exceptionHandling;

public class Multi_CatchBlock {

	public static void main(String[] args) {
		
		try
		{
			String str=null;
			System.out.println(str.length());
			int arr[]=new int[5];
			arr[10]=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("executed");
		
		//handle the exception without maintaining the order of exceptions
		//compile-time error
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		System.out.println("executed");
	}
}
