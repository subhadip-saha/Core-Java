package sp102_static_variables;

//static variable are used for memory management/memory save/memory efficient

//see here, for every Employee object like e1 and e2 those 3 field values will be kept, Now for 1000 employees 1000 objects 
//has to be created, 1000 times memory occupied. now for every employee company name is same, so we are misusing the space for same company name in every object.
/*
public class Employee {

	int empid;
	String name;
	String company;
	
	Employee(int empid, String name, String company)
	{
		this.empid = empid;
		this.name = name;
		this.company = company;
	}
	
	void display()
	{
		System.out.println(empid + " " + name + " " + company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "Sujit", "Google");
		e1.display();
		Employee e2 = new Employee(102, "Subhadip", "Google");
		e2.display();
		Employee e3 = new Employee(103, "Sutapa", "Google");
		e3.display();
		
	}

}

101 Sujit Google
102 Subhadip Google
103 Sutapa Google
*/

//rather use static keyword to save memory     
/*
now all Employe objects share those static variable
earlier, in every object 3 fields were present, empid,name.company but now two objects are present empid,name
that one static variable will occupy a memory individually and is shared amongst all the objects
*/
public class Employee {

	int empid;
	String name;
	static String company = "Google";
	
	Employee(int empid, String name)
	{
		this.empid = empid;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(empid + " " + name + " " + company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "Sujit");
		e1.display();
		Employee e2 = new Employee(102, "Subhadip");
		e2.display();
		Employee e3 = new Employee(103, "Sutapa");
		e3.display();
		
	}

}
/*
101 Sujit Google
102 Subhadip Google
103 Sutapa Google

If a value is common for all objects, make that variable as static, so that memory wastage can be reduced.
earlier 1000 times memory allocated for storing company value for each and every 1000 employees, now only 1 time stored ond
it is shared across all of them. So, 999 times memory saved. Program executes faster.  
*/