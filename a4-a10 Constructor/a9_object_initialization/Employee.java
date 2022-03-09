//in this way the size of the program will increase as it becomes lengthy

package a9_object_initialization;

public class Employee {

	String name;
	int emp_id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name = "Deepak";
		e1.emp_id = 101;
		Employee e2 = new Employee();
		e2.name = "Subhadip";
		e2.emp_id = 102;
		System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
		System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
	}

}
