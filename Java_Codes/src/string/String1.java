package string;

import java.util.Scanner;

public class String1 {
//	Java Program to count the total number of characters in a string
	public static int countCharacters(String str)
	{
		int count=0 ;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		int c=countCharacters(s.nextLine());
		System.out.println("Number of characters in String:"+c);
	}

}
