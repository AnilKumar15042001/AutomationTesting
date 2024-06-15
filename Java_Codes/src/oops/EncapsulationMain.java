package oops;

import java.util.Scanner;

public class EncapsulationMain {

	public static void main(String[] args) {
		
//		Encapsulation ec=new Encapsulation();
//		System.out.println("Enter value of a,b & c:");
//		Scanner s=new Scanner(System.in);
//		ec.setA(s.nextInt());
//		ec.setB(s.nextInt());
//		ec.setC(s.nextInt());
//		ec.setD(s.nextInt());
//		System.out.println(ec.getA());
//		System.out.println(ec.getB());
//		System.out.println(ec.getC());
//		System.out.println(ec.getD());
		
		Practice p=new Practice();
		p.setAge(24);
		System.out.println(p.getAge());
		p.setName("Anil");
		System.out.println(p.getName());
	}
}
