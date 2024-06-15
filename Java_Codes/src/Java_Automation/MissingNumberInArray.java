package Java_Automation;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int arr[]= {1,4,5,3,7};
		
		Arrays.sort(arr);
		
//		for(int x:arr)
//		{
//		System.out.println(Arrays.toString(arr));
//		}
	
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int c=0;
			int temp=0;
			for(int j=i-1;j>=0;j--)
			{
				c=arr[i]-arr[j];
				temp=arr[j];
				break;
			}
			if(c==2)
			{
				System.out.println("Missing number is:"+arr[i]+"-"+1+"="+(arr[i]-1));
			}
			
		}
	}

}
