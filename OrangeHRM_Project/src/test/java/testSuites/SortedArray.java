package testSuites;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,9,2,4,6,8};
		System.out.println("Before without sorted:"+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorted:"+Arrays.toString(arr));
		
		System.out.println();
		
		//String
		String[] str= {"1","3","5","7","9","2","4","6","8"};
		String temp2="";
		System.out.println("Before without sorted:"+Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(Integer.parseInt(str[i])>Integer.parseInt(str[j]))
				{
					temp2=str[i];
					str[i]=str[j];
					str[j]=temp2;
				}
			}
		}
		System.out.println("After sorted:"+Arrays.toString(str));
	}
}
