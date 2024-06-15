package Java_Automation;

public class Multi_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
//			int  arr[]=new int[5];
//			arr[5]=30;
			String str=null;
			System.out.println(str.length());
		}
		    catch(ArithmeticException ae)
			{
				System.out.println("Arithmetic Exception occurs:"+ae.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println("ArrayIndexOutOfBounds Exception occurs:"+aie.getMessage());
			}
		    catch(Exception e)
	        {
	    	    System.out.println("Parent Exception:"+e.getMessage());
	        }
		System.out.println("Rest of code");

}
}