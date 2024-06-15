package Java_Automation;

public class SumOfNthNumber {

	int sum=0;
	//logic1:-using for loop
	public void logic1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	//logic2:-Using Formula for the Sum of Nth Term
	public void logic2(int n)
	{
		sum=sum+((n*(n+1))/2);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfNthNumber sn=new SumOfNthNumber();
		sn.logic2(5);
	}

}
