package string;

public class EndsWith {
	
	public static void endsWithMethod(String str,String str2)
	{
		System.out.println(str.endsWith(str2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		endsWithMethod("Anil kumar","r");
		endsWithMethod("Anil kumar","kumar");
	}

}
