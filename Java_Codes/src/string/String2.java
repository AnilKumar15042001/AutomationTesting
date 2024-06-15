package string;

import java.util.Scanner;

public class String2 {
//	Java Program to Count the Total Number of Punctuation Characters Exists in a String
//	punctuation marks (!, . , ' , - , " , ? , ; )
	public static int countPunctuations(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)==';'||str.charAt(i)==':'||str.charAt(i)=='/'||str.charAt(i)=='?'||str.charAt(i)=='"')
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
		System.out.println("Total number of panctuations:"+countPunctuations(s.nextLine()));
		
		
	}

}
