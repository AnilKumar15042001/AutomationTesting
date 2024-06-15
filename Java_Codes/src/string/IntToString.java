package string;

public class IntToString {
//convert integer to string
	public static void main(String[] args) {
		
		int i=100;
		// logic:-1
		String s=String.valueOf(i);
		System.out.println("value of s:"+s);
		System.out.println(s+100);//Here + is string concatenation operator
		System.out.println(i+100);//Here + is binary plus operator
		//logic:-2
		String str=Integer.toString(i);
		System.out.println("value of str:"+str);
		//System.out.println(str+500);
		//System.out.println(i+500);
		
		//logic:-3
		String str2=String.format("%d", i, args);
		//System.out.println(str2+200);
	}

}
