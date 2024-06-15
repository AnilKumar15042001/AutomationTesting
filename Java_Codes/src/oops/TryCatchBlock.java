package oops;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		String str=null;
		try
		{
		System.out.println(str.length());
		}
		finally
		{
			str="Anil";
			System.out.println(str.length());
		}
		System.out.println("Execution success");
	}
}
