package Java_Automation;

public class ObjectComparison {
static boolean b;
static short sh;
static int n;
static long l;
static String s;
static Double dou;
static Float f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		f=new Float(5.3);
		Integer a=new Integer(123);
		Integer i=new Integer(123);
		Double d=new Double(253.5);
		
		System.out.println("Objects are not equals:"+f.equals(dou));
		System.out.println("Objects are equals:"+a.equals(123));
	}

}
