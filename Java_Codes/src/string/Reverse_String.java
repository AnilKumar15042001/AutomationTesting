package string;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str;
		String rev ="";
		System.out.println("Enter a String:");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		//logic-1:-using string concatenation(+)operator
	  /*int len=str.length();
	    for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		*/
		
		//logic-2:-using characterArray
		/*char a[]=str.toCharArray();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String:"+rev);
		*/
		
		//logic-3:-using StringBuffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reverse String:"+sb.reverse());
		
		//logic-4:-using StringBuilder class
		StringBuilder sbl=new StringBuilder("Anil kumar");
		sbl.append(" Uttarkabat");
		System.out.println(sbl);
		System.out.println(sbl.reverse());
		
		
		
		
		
	}

}
