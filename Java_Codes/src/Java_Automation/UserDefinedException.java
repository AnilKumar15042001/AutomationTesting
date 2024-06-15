package Java_Automation;

class UserDefinedParentException extends Exception
{
	public UserDefinedParentException(String str)
	{
		super(str);
	}
}
public class UserDefinedException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			throw new UserDefinedParentException("Exception occur");
		}
		catch(UserDefinedParentException e)
		{
			System.out.println("print the exception");
			System.out.println(e.getMessage());
		}
	}

}
