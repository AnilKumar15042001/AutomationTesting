package array_ArrayList;

public class Array8 {
//Program to print the elements of an array present on odd position
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 // 1 2 3 4 5 positions
		int arr[]= {1,2,3,4,5};
		        //  0 1 2 3 4 indexes
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
	}

}
