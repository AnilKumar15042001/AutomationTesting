package array_ArrayList;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Approach-1
//		int a[][]=new int[2][2];
//		int []a[]=new int[2][2];
//		int [][]a=new int[2][2];
		
//		Approach-2
		int a[][]= { {10,20},{30,40},{50,60},{70,80},{90,100}};
		
		System.out.println("Row size:"+a.length);
		
		System.out.println("Column size:"+a[0].length);
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
	}

}
