package testSuites;

import java.io.File;

public class FindSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file="C:\\AutomationTesting\\OrangeHRM_Project\\src\\test\\resources\\photo\\Anil.jpg";
		File f=new File(file);
		long bytes=f.length();
		double d=((double)bytes/1024)/1024;
		if(d<1)
		{
			System.out.println(d);
		}
		else
		{
			System.out.println("error");
		}
	}

}
