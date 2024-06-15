package string;

public class GetChars {
	
	public static void getCharsMethod(String str)
	{
		char[] ch=new char[10];
		str.getChars(0, 10, ch, 0);
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCharsMethod("Anil kumar Uttarkabat");
	}

}
