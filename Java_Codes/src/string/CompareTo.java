package string;

public class CompareTo {

	public void compareToMethod(String str,String str2)
	{
		System.out.println(str.compareTo(str2));
//		System.out.println(str.compareToIgnoreCase(str2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompareTo obj=new CompareTo();
		CompareTo obj2=new CompareTo();
		obj.compareToMethod("Anil", "Anil");
//		Java String compareTo(): empty string
		obj2.compareToMethod("ANIL", "anil");
//		Java String compareTo(): case sensitive
	}

}
