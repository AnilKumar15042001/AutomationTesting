package Java_Automation;

import java.util.ArrayList;
import java.util.Scanner;
public class Prime_Factor_Number
{
   public static void main(String[] args) {

	   
	   int n;
	   int sum=0;
	   
	   System.out.println("Enter a number:");
	   Scanner s=new Scanner(System.in);
	   n=s.nextInt();
	   int c=0;
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