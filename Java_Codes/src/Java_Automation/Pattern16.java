package Java_Automation;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row size:");
		int row=s.nextInt();
		System.out.println("Enter col size:");
		int col=s.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			if(j>=(col/2)-1 && j<=(col/2)+2 || i>=(row/2) && i<=(row/2)+1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
  }
}
