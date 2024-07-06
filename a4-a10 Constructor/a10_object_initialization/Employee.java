//Main work of the constructor is - object initialization
//here parameterized ctor is defined.
//program will not be lengthy

package a10_object_initialization;

public class Employee {

	String name; 
	int emp_id;
	
	Employee(String name, int emp_id)
	{
		System.out.println("parameterized constructor");
		this.name = name;
		this.emp_id = emp_id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Deepak", 101);
		Employee e2 = new Employee("Subhadip", 102);
		System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
		System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
	}

}

/*
Employee 1 : Deepak 101
Employee 2 : Subhadip 102
*/
