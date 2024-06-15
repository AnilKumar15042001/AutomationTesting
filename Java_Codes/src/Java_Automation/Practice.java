package Java_Automation;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;


public class Practice {
	
//	int num=100;

	public static void main(String args[]) {

		        int rows = 4;
		        for (int i = 1; i <= rows; i++) {
		            int sum=0;
		            if(i==1)
	            	{
	            		System.out.print("  ");
	            	}
		            for (int j = 1; j <= i; j++) {
		    
		            	sum=i*j;
		                System.out.print(sum + " ");
		               
		            }
		            System.out.println();
		        }

	}
//		String s="Anilkumar";
//		System.out.println(s);
//		s.charAt(2);  //immutable
//		System.out.println(s);
//		
//		
//		
//		int a[]= {1,2,5,3,4};
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);  //mutable
//		System.out.println(Arrays.toString(a));
//		String args1[]= {"10","20",};
//		int n=Integer.parseInt(args1[0]);
//		System.out.println(n);
//		
//		
//		
		
//		String str=RandomStringUtils.random(5, "");
//		System.out.println(str);
	}


