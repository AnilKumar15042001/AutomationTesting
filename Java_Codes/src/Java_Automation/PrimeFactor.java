package Java_Automation;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n;
		   System.out.println("Enter a number:");
		   Scanner s=new Scanner(System.in);
		   n=s.nextInt();
		   ArrayList<Integer> list=new ArrayList<>();
		   for(int i=1;i<=n;i++)
		   {
			   if(n%i==0)
			   {
				list.add(i);   
			   }
			   
		   }
		   System.out.println(list);
		   for(int value:list)
		   {
			   int count=0;
			   for(int j=1;j<=n;j++)
			   {
				   if(value%j==0)
				   {
					   count++;
				   }
			   }
			   if(count==2)
			   {
				   System.out.println(value);
			   }
		   }
	}

}
