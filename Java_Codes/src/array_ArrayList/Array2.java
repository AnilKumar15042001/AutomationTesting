package array_ArrayList;

public class Array2 {
//	Program to find the frequency of each element in the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[]
		{10,20,10,30,40,50,10,20,30,10};
		int fr[]=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(fr[i]!=visited)
				System.out.println(arr[i]+" "+fr[i]);
		}
	}

}
