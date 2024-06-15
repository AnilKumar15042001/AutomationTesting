package Java_Automation;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Find length
		String s="Anil kumar";
		System.out.println(s.length());
		
		//conactnation
		String s2=" Uttarkabat";
		String s3=" Babu";
		String s4=" Babu";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.concat(" Uttarkabat"));
		System.out.println(s.concat(s2).concat(s3));
		System.out.println(s.concat(s2+s3));
		System.out.println("Anil".concat(" Babu"));
		
		//trim():-remove spaces right and left side
		System.out.println(s2.length());
		System.out.println(s2.trim());
		System.out.println(s2.trim().length());
		
		//charAt():-returns a character from a string based on index
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(0));
		
		//contains():-returns true or false
		System.out.println(s2.contains(s2));
		System.out.println(s.contains("Al"));
		System.out.println(s.contains("An"));
		System.out.println(s.contains(" "));
		
		//equals() or equalsIgnoreCase():-compare strings
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals("Anil"));
		System.out.println(s3.equalsIgnoreCase(" babu"));
		
		//replace():-replace single/multiple(sequence) of character in a string
		System.out.println(s2.replace("a", "x").replace("t", "z"));
		System.out.println(s.replace("Anil", "anil").replace("kumar", "babu"));
		
		//substring():-extract substring from the main string
		System.out.println(s.substring(0));
		System.out.println(s.substring(3,10));
		System.out.println(s.subSequence(2, 8));
		
		//toUpperCase():-convert string to as capital letter
		System.out.println(s.toUpperCase());
		
		//toLowerCase():-convert string to as small letter
		System.out.println(s.toLowerCase());
		
		//split():-split the string into multiple parts based on delimeter
		String str[]=s.split("k");
		System.out.println(Arrays.toString(str));	
		
	}

}
