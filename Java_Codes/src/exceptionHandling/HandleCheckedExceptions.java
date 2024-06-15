package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandleCheckedExceptions {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream file=new FileInputStream("file.txt");
			System.out.println("Readable file");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
