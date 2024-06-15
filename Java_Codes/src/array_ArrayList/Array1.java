package array_ArrayList;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Program to copy all elements of one array into another array
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.print("Orginal value:");
		for(int a1:arr1)
		{
			System.out.print(a1+" ");
		}
		System.out.println();
		System.out.print("Duplicate value:");
		for(int a2:arr2)
		{
			System.out.print(a2+" ");
		}
	}

}
