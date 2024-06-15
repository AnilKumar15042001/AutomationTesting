package exceptionHandling;

class UserDefined  extends Exception
{
	public UserDefined(String str)
	{
		super(str);
	}
}

public class User_DefinedThrowingException {

	public static void main(String[] args) {
		
		try
		{
			throw new UserDefined("this is user defined");
		}
		catch(UserDefined e)
		{
			System.out.println(e.getMessage());
		}
	}
}
