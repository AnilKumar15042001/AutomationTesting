package Java_Automation;

interface WebDriver
{
	int a=10;
	void chrome(); // --- |---->Interface contains static & final variables by default
	void firefox();// --- |---->These are all abstract methods(abstract method don't have body)
	void edge();   // --- |---->In interface by  default methods are Public 
}

public class Interface implements WebDriver {
	   public void chrome()
	    {
	    	System.out.println("Chrome driver should be opened");
	    }
	   public void firefox()
	   {
		   System.out.println("Firefox driver should be opened");
	   }
	   public void edge()
	   {
		   System.out.println("Edge driver should be opened");
	   }
	   public void safari()
	   {
		   System.out.println("Safari driver should be opened");
	   }

	public static void main(String[] args) {
		
		Interface i=new Interface();
		WebDriver j=new Interface();
		i.chrome();
		j.chrome();
		i.firefox();
		j.firefox();
		i.edge();
	    j.edge();
	    i.safari();
	}

}
