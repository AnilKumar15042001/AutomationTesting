package string;

import java.util.Arrays;
import java.util.Scanner;

public class String17 {
//Java program to find the duplicate words in a string
	
	public static void duplicateWords(String str)
	{
		str.toLowerCase();
		String words[]=str.split(" ");
		System.out.println(Arrays.toString(words));
		for(int i=0;i<words.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
				
			}
			if(count>1 && words[i]!="0")
			{
				System.out.println(words[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter words:");
		Scanner s=new Scanner(System.in);
		duplicateWords(s.nextLine());
	}

}
