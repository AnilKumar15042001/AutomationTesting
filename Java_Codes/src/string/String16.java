package string;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class String16 {

	public static void duplicateCharacters(String str)
	{
		char ch[]=str.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}	
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		
		duplicateCharacters(s.nextLine());
		
	}

}
