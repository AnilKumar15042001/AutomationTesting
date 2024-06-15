package Java_Automation;

public class Continue {

	public static void main(String[] args) {
		
		int n=0;
		while(n<53)
		{
			n++;
			if(n==50 || n==51 || n==52)
				
				continue;
			
			System.out.println(n);
		}
	}

}
