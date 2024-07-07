//Main work of the constructor is - object initialization
//here no arg ctor is defined by programmer, so compiler does not add a default ctor.
//Also here default values for String and int are assigned


package a8_object_initialization;

public class Employee {

//globally declared
	String name;
	int emp_id;
	
	Employee()
	{
		System.out.println("No arg constructor");
		//name and emp_id cannot be declared here
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
		System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
	}

}