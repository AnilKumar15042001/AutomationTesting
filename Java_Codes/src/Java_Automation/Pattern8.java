package Java_Automation;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i && j<=10-i)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
