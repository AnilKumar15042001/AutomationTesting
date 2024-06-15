package string;

import java.util.Scanner;

public class String3 {
	
	public static String vowelConsonants(String str)
	{
		int vCount=0;int cCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
					||str.charAt(i)=='u')
			{
				 vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				 cCount++;
			}
		}
		return "vowel:"+vCount+"  "+"consonants:"+cCount;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		System.out.println(vowelConsonants(s.nextLine()));
	}

}
