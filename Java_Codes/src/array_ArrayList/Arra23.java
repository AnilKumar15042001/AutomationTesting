package array_ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class Arra23 {
//How to Sort an Array in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]= {1,3,2,5,4};
		//Sort Array in Ascending Order
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Sort Array in Descending Order
        System.out.println("Array elements in descending order:");
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        //How to Sort Subarray
        System.out.println("sorts subarray form index 1 to 4  ");
        Arrays.sort(arr, 0, 5);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}
