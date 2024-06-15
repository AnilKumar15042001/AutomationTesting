package string;

public class Intern {
	
	public static void internMethod()
	{
//		String s1=new String("Anil");
//		String s2=new String("Anil");
//		System.out.println(s1==s2);
		String s1=new String("Anil").intern();
		String s2=new String("Anil").intern();
		System.out.println(s1==s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		internMethod();
	}

}
