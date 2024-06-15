package Java_Automation;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
				  //System.out.print(i);
					System.out.print(j);
				}
				
			}
			System.out.println();
		}

	}

}
/*
print j value
12345 
1234 
123 
12 
1
print i value
11111
2222
333
44
5
*/