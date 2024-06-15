package array_ArrayList;

public class Array22 {
//Java Program to print Odd and Even Numbers from an Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		System.out.print("Even numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
