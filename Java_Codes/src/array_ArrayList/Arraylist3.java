package array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist3 {

	public static void main(String[] args) {
		
		Object o[] = new Object[20];
		ArrayList list=new ArrayList();
		System.out.println("entter");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
		  list.add(s.nextInt());
		  list.add(s.next());
		  System.out.println(list);
		}
		System.out.println(list.size());
		
	}
}
