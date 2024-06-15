package Java_Automation;

public class StringToInt {
//convert string value to integer
	public static void main(String[] args) {
		
		String s="200";
	    //	logic:-1
		int i=Integer.parseInt(s);
		System.out.println("value of i:"+i);
		System.out.println(s+100);//Here + is string concatenation operator
		System.out.println(i+100);//Here + is binary plus operator
		// logic:-2
		int n=Integer.valueOf(s);
		System.out.println("value of n:"+n);

	}

}
