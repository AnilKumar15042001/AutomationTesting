package array_ArrayList;

public class Array10 {
//Program to print the smallest element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,30,20,50,40};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest element of an Array:"+min);
	}

}
