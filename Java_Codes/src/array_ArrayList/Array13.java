package array_ArrayList;

public class Array13 {
//Java Program to right rotate the elements of an array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,40,50};
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int n=5;
		for(int i=0;i<n;i++)
		{
			int last=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;		
		}
		System.out.println();
		System.out.println("Right rotate array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
