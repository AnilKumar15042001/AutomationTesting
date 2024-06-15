package oops;

interface WebDriver
{
	void chrome();
	void firefox();
	void edge();
}

class Chrome implements WebDriver
{
	public void chrome()
	{
		System.out.println("chrome");
	}

	@Override
	public void firefox() {
		// TODO Auto-generated method stub
		System.out.println("chrome-firefox");
	}

	@Override
	public void edge() {
		// TODO Auto-generated method stub
		System.out.println("chrome-edge");
	}
}
class Firefox implements WebDriver
{
	public void firefox()
	{
		System.out.println("firefox");
	}

	@Override
	public void chrome() {
		// TODO Auto-generated method stub
		System.out.println("firefox-chrome");
	}

	@Override
	public void edge() {
		// TODO Auto-generated method stub
		System.out.println("firefox-edge");
	}

	
}
class Edge implements WebDriver
{
	public void edge()
	{
		System.out.println("edge");
	}

	@Override
	public void chrome() {
		// TODO Auto-generated method stub
		System.out.println("edge-chrome");
	}

	@Override
	public void firefox() {
		// TODO Auto-generated method stub
		System.out.println("edge-firefox");
	}
}
public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new Edge();
		driver.chrome();
		driver.edge();
		driver.firefox();
	}

}
