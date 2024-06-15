package Java_Automation;

import java.util.Scanner;

public class Addition {
public static void add(int a,int b) {
	int c=a+b;
	System.out.println("Addition of a & b ="+c);
}

	public static void main(String[] args) {
     
		int a,b;
		System.out.println("Enter a & b value:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		Addition.add(a,b); //calling the static method

	}

}
