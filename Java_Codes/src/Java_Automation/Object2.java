package Java_Automation;
//initialization through by method
class Company{
	//using instance variable
	int rollno;
	String name;
public void details(int r,String n) {  
	rollno=r;
	name=n;
}
public void display() {
	System.out.println(rollno+" "+name);
}
}
public class Object2 {

	public static void main(String[] args) {
		
		Company obj=new Company();
		Company ref=new Company();
		obj.details(100,"Anil");  //value initialization through the method
		ref.details(200,"Babu");
		obj.display();
		ref.display();
		
	}

}
