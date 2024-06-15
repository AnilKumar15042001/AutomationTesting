package array_ArrayList;

public class Array3 {
//Program to left rotate the elements of an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[]
				{1,2,3,4,5};
		System.out.print("Original Array is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int n=3;
		for(int i=0;i<n;i++)
		{
			int j;
			int first=arr[0];
			for( j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		System.out.print("Array of left rotation:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
