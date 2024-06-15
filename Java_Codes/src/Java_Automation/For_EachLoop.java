package Java_Automation;

public class For_EachLoop {

	public static void main(String[] args) {
	    // Arr.Name   Arr.value
		int a[]= {10,20,30,40,50};
		for(int i:a) {
			System.out.println(i); //print all array value
			/*if(i==50) {             ---->Print Particular value using if condition
				System.out.println(i);
			}*/
		}
		System.out.println();
		System.out.println(a[2]);  //---->print particular  value using index number(a[])
	}
}
