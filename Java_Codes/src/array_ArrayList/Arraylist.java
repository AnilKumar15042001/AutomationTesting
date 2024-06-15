package array_ArrayList;

import java.util.*;

public class Arraylist {

static	ArrayList ar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ar=new ArrayList();
		System.out.println("Enter array Value:");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			ar.add(s.nextInt());
		}
		
		System.out.println(ar);
		
		System.out.println(ar.get(3));
		
		ar.set(3, s.nextInt());
		System.out.println(ar);
		
	}

}
