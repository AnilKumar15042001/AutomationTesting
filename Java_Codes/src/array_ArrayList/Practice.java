package array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int arr[]=new int[10];
//    	int arr2[]=new int[10];
//		
//		int visit=0;
//		
//		System.out.println("Enter array values:");
//		
//		Scanner s=new Scanner(System.in);
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=s.nextInt();
////			arr2[i]=arr[i];
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=1;
//			
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					count++;
//					arr[j]=visit;
//				}
//			}
//			if(arr[i]!=visit)
//			{
//				arr2[i]=count;
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=visit)
//			{
//				System.out.println(arr[i]+" "+arr2[i]);
//			}
//		}
//		int []arr= {1,2,3,4,89,87};
//		
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length/2;i++) {
//			int c=arr[i];
//			 arr[i]=arr[arr.length-i-1];
//			 arr[arr.length-i-1]=c;
//			 System.out.println(Arrays.toString(arr));
//			 
//			
//		}
		
		int arr1[]= {1,2,2,4,3};
		
		int arr2[]= {2,5,1,4,5};
		
		int count=0;
		int temp=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
				   count++;
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					arr1[j]=0;
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			//System.out.println(Arrays.toString(arr1));
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					temp++;
				}
			}
		}
		System.out.println("{"+count+" "+temp+"}");
//		System.out.println("common elements are:");
//		for(int i=0;i<arr3.length;i++)
//		{
//			System.out.println(arr3[i]);
//		}
		
	}

}
