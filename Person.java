
public class Person {
	
	
	//Create variable
	String name;
	int age;
	String Address;
	String mobile_no;
	
	//default Constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized Constructor
	public Person(String name, int age, String address, String mobile_no) {
		super();
		this.name = name;
		this.age = age;
		this.Address = address;
		this.mobile_no = mobile_no;
	}
	
	//display Method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", Address=" + Address + ", mobile_no=" + mobile_no + "]";
	}
	
	
	
}
