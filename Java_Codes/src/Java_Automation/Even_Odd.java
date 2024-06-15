package Java_Automation;

import java.util.Scanner; //scanner class package
public class Even_Odd {
public static void evenOdd(int n) {//int n is parameter value
	//method body
	if(n%2==0)
	{
		System.out.println(n+" is even");
	}
	else
	{
		System.out.println(n+" is odd");
	}
}
	public static void main(String[] args) {
		//int i=1;
		//int sum=0;
		/*while(i<=500)
		{
			if(i%2==0)
			{
				System.out.println("Even Number:"+i);
			}
			else
			{
				System.out.println("Odd Number:"+i);
			}
			i++;
		}*/
		/*for(i=1;i<=500;i++)
		{
			if(i%2==0) {
				
				System.out.println("Even Number:"+i);
				sum=sum+i;
				System.out.println(sum);
			}
		}*/
        int n;
        System.out.println("Enter a number:");
        //creating scanner class object
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Even_Odd.evenOdd(n); //Even_Odd is used for static method and evenOdd() is used to access the static method 
        //evenOdd(n);        //without using class name to access the method(method calling)
       // Even_Odd obj=new Even_Odd(); // it is used for non-static method
        //obj.evenOdd(n);    // it is used to call the non-static method
	}

}
