package array_ArrayList;

public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Java Program to add two matrices
		
		int a[][]= {{10,20},{30,40},{50,60}};
		int b[][]= {{100,200},{300,400},{500,600}};
		
		int c[][]=new int[a.length][b[0].length];
		
		int i=0;
		int j=0;
		
		System.out.println("1st array value is:");
		
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("2nd array value is:");
		
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Addition of 1st and 2nd array:");
		
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"+"+b[i][j]+"="+(a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
		
//		for( i=0;i<a.length;i++)
//		{
//			for( j=0;j<a[0].length;j++)
//			{
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		for(int arr[]:c)
//		{
//			for(int x:arr)
//			{
//				System.out.print(a[i][j]+"+"+b[i][j]);
//			}
//			System.out.println();
//		}
	}

}
