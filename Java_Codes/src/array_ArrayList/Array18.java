package array_ArrayList;

public class Array18 {
//Java Program to find Largest Number in an Array
	public static int array18()
	{
		int a[]= {5,2,6,3,4,1,7,9,8,10};
		int len=a.length;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[len-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		array16();
		System.out.println("largest number is:"+array18());
	}

}
