package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowKeyword {
	
	public static void uncheckedException(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}
	
	public static void checkedException() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("abc.txt");
		
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try
		{
//			uncheckedException(15);
			checkedException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Exception generated");
	}
}
