
public class Emplyoee extends Person{
	
	//Create variable
	String eid;
	String dept;
	int salary;
	
	// parameterized Constructor
	public Emplyoee(String eid, String dept, int salary) {
		super();
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}
	
	// default Constructor
	public Emplyoee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//display methods
	@Override
	public String toString() {
		return "Emplyoee [eid=" + eid + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
