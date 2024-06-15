package array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		float f[]= new float[5];
		for(float i:f)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		//we can store different value in an array
		Object x[]= {100,10.2,'a',"Anil",true};
		
		for(Object obj:x)
		{
			System.out.println(obj);
		}
		
}
}