package Java_Automation;
//initialization through by reference
class Student{
	int id;
    String name;
}
public class Object1 {

	public static void main(String[] args) {
		//first object
		Student obj=new Student();
		obj.id=2101;     //value initialization
		obj.name="Anil";
		System.out.println(obj.id+" "+obj.name);
		//Second object
		Student ref=new Student();
		ref.id=2102;
		ref.name="Babu";
		System.out.println(ref.id+" "+ref.name);

	}

}
