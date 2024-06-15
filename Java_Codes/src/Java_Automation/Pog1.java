package Java_Automation;
import java.util.Scanner;
public class Pog1 {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter a Value:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%5==0)
		{
			System.out.println("Hello");
		}
		else 
		{
           System.out.println("Byy");
	    }

}
}