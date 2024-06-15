package Java_Automation;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Fahrenheit value is:");
		double fahrenheit=s.nextDouble();
		double celsius=((5*(fahrenheit-32.0))/9.0);
		System.out.println(fahrenheit+" "+celsius);
	}

}
