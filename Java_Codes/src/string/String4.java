package string;
import java.util.Arrays;
import java.util.Scanner;
public class String4 {
//	Java Program to determine whether two strings are the anagram
	public static void anagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Both String are not equal");
		}
		else
		{
			char[]arr1=str1.toCharArray();
			char[]arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)==true)
			{
				System.out.println("Both the string are anagram");
			}
			else
			{
				System.out.println("Both the string are not anagram");
			}
			
		}
	}
	public static void sort(String str,String str2)
	{
		char temp;
		char temp2;
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		char[] arr=str.toCharArray();
		char[] arr2=str2.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				if(arr2[i]>arr2[j])
				{
					temp2=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp2;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+arr2[i]);
		}
		if(arr.equals(arr2))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter both String:");
		sort(new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
//		anagram(new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
	}

}
