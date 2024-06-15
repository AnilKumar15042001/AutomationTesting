package Java_Automation;

public class SumOfNumbersInGivenRange {
//Find the Sum of the Numbers in a Given Range in Java
	int sum=0;
	//logic1:-using for loop
	public void logic1(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	//logic2:-using formula(b*(b+1)/2-a*(a+1)/2+a)
	public void logic2(int a,int b)
	{
		sum=(b*(b+1)/2)-(a*(a+1)/2)+a;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfNumbersInGivenRange sr=new SumOfNumbersInGivenRange();
		sr.logic2(10, 20);
	}

}
