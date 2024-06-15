package array_ArrayList;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
//Program to print the duplicate elements of an array
	public static void main(String[] args) {


		System.out.println(Arrays.toString(generateRandomNumbers(10,10)));
	
		boolean dupli=false;
		int arr[]= {10,20,10,30,40,20,10};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
					dupli=true;
				}
			}
		}
		if(dupli==true)
		{
			System.out.println("Duplicate is found");
		}
		else
		{
			System.out.println("Duplicate not found");
		}
	}
	public static int[] generateRandomNumbers(int digit,int size)
	{
		Random rand=new Random();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rand.nextInt(digit);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
			}
		}
		return arr;
//		System.out.println(Arrays.toString(arr));
		
	}

}
