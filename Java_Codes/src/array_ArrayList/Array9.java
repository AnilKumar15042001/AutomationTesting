package array_ArrayList;

public class Array9 {
//Program to print the largest element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,30,20,50,40};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element of an Array:"+max);
	}

}
