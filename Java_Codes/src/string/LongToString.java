package string;

public class LongToString {
// convert long to string
	public static void main(String[] args) {

		Long l=6370344052l;
		// logic:-1
		String str=String.valueOf(l);
		System.out.println(str);
		//System.out.println(str+100);
		
		// logic:-2
		String str2=Long.toString(l);
		System.out.println(str2);
		//System.out.println(str2+2000);
	}

}
