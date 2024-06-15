package oops;

public class Encapsulation {

	private int a,b,c;
	private int d=50;
	
	public int getA() {
		return a+b+c+d;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return a-b-c-d;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return a*b*c*d;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setD(int d)
	{
		this.d=d;
	}
	public float getD()
	{
		return a/b/c/d;
	}
}
