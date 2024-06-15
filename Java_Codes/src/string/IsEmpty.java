package string;

public class IsEmpty {
	
	public static boolean isEmptyMethod(String str)
	{
//		return str.isEmpty();
		return str.isBlank();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isEmptyMethod("Anil"));
		System.out.println(isEmptyMethod("  "));
		System.out.println(isEmptyMethod(""));
	}

}
