package Java_Automation;

public class Bre_Con { //Break & Continue keyword

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break; //condition is true it will exit from the statement 
		}
			System.out.println(i);

	    }
		System.out.println();
		System.out.println();
		System.out.println();
		for(int j=1;j<=10;j++)
		{
			if(j==5)
			{
				continue; //condition is true it will break current process & continue next level
			}
			System.out.println(j);
		}

}
}