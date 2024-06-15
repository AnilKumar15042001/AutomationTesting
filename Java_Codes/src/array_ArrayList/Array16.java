package array_ArrayList;

public class Array16 {
//Java Program to find Third Largest Number in an Array
	public static int array16()
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
		return a[len-3];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		array16();
		System.out.println("Third largest number is:"+array16());
	}

}
