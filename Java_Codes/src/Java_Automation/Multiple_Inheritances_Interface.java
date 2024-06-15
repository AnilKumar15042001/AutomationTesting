package Java_Automation;

interface Browser
{
	void chrome();
	void firefox();
}

interface Alert
{
	void accept();
	void dismiss();
}
public class Multiple_Inheritances_Interface implements Browser,Alert
{
	public void chrome()
	{
	    	System.out.println("Chrome driver should be opened");
	}
	public void firefox()
	{
		System.out.println("Firefox driver should be opened");
	}
	public void accept()
	{
		System.out.println("Click on OK Button");
	}
	public void dismiss()
	{
		System.out.println("Click on Cancel Button");
	}
	public static void main(String[] args) {
		
		Multiple_Inheritances_Interface mii=new Multiple_Inheritances_Interface();
		mii.chrome();
		mii.firefox();
		mii.accept();
		mii.dismiss();
		Browser mii2=new Multiple_Inheritances_Interface();
		mii2.chrome();
		mii2.firefox();
}

}