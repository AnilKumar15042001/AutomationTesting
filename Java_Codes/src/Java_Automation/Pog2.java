package Java_Automation;
import java.util.Scanner;
public class Pog2 {

	public static void main(String[] args) {
		int unit;
		int price=0;
		System.out.println("Enter unit value:");
		Scanner s=new Scanner(System.in);
		unit=s.nextInt();
			if(unit<=100)
			{
				System.out.println("no charge");
			}
			else if(unit>100 && unit<=200)
			{
				price=price+((unit-100)*5);
				System.out.println(price);
			}
			else if(unit>200)
			{
				price=price+(((unit-100)-100)*10)+(5*100);
				System.out.println(price);
			}
	}

}
