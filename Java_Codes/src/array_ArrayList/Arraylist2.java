package array_ArrayList;

import java.util.*;

public class Arraylist2 {
static ArrayList list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list=new ArrayList<Integer>();
		System.out.println("Enter Arraylist value:");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			list.add(s.next());
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
