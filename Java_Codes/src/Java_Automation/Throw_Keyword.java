package Java_Automation;

public class Throw_Keyword {

	public static void throwKeyword(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible for vote");
		}
		else
		{
			System.out.println("Eligible  for vote");
		}
	}
	static public void main(String[] args) {
		// TODO Auto-generated method stub

		Throw_Keyword.throwKeyword(16);
		System.out.println("Rest of code");
		
	}

}
