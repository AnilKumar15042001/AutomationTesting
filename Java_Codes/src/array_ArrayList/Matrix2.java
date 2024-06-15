package array_ArrayList;

public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{10,20},{30,40},{50,60}};
		int b[][]= {{102,35},{50,64},{55,67}};
		
		int c[][]=new int [a.length][b[0].length];
		
		System.out.println("1st array values are:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("2nd array values are:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After substraction values are:");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(a[i][j]+"-"+b[i][j]+"="+(a[i][j]-b[i][j])+" ");
			}
			System.out.println();
		}
	}

}
