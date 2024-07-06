//Main work of the constructor is - object initialization
//here no ctor is defined, so compiler added a default ctor and default values for String and int are assigned

package a7_object_initialization;

public class Employee {

	String name;
	int emp_id;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
		System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
	}

}

/*
o/p:
Employee 1 : null 0
Employee 2 : null 0
*/
