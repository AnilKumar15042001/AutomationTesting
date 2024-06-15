package string;

import java.io.UnsupportedEncodingException;

public class GetBytes {
	
	public static void getBytesMethod(String str) throws UnsupportedEncodingException
	{
//		byte[] b=str.getBytes("UTF-16");
		byte[] b=str.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		getBytesMethod("anil");
	}

}
