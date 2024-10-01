package testSuites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RemoveRandomValues {

	
	public static void main(String[] args) {
		
		Integer[] arr= {3,1,2,3,4,5};
		System.out.println("Enter a random value:");
		int randomNum=new Scanner(System.in).nextInt();
		List<Integer> list=new ArrayList(Arrays.asList(arr));
		
		for(int ar: list)
		{
			if(ar==randomNum)
			{
				list.remove(ar);
			}
		}
		System.out.println(list);
	}
}
