package Java_Automation;

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {
		
		String str;
		String rev="";
		System.out.println("Enter a string:");
        Scanner s=new Scanner(System.in);
        str=s.next();
        String org_str=str;
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
        	rev=rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
        	System.out.println(rev+" is pallindrome string");
        }
        else
        {
        	System.out.println(rev+" is not pallindrome string");
        }
}
}