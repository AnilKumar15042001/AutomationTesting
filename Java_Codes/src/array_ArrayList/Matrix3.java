package array_ArrayList;

public class Matrix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2},{1,2}};
		int b[][]= {{1,2},{1,2}};
		
		int c[][]=new int[a.length][b[0].length];
		
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
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				c[i][j]=0;
				for(int k=0;k<b[0].length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
