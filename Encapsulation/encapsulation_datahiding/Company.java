package encapsulation_datahiding;

/*
class Employee
{
	int empid;
}
class Company
{
	public static void main(String[] args) 
	{
		
		Employee e = new Employee();
		e.empid = 204;					//this data is not safe, anyone can access this data from this class. So, not a good programming practice
		System.out.println(e.empid);
	}
}
204
*/

/*
class Employee
{
	private int empid;
}
class Company
{
	public static void main(String[] args) 
	{
		
		Employee e = new Employee();
		e.empid = 204;					//this data is now safe, anyone cannot access this data from this class. It is called data hiding.
		System.out.println(e.empid);	//to access this data we need to have public getters and setters methods
	}
}
*/


class Employee
{
	/*steps for encapsulation: 
		1.make variables as private
		2.provide getter-setter methods as public
		*/
	//private access modifier helps in data hiding
	private int empid;		//- Data hiding - private members cannot be accessed directly outside the class by another class. 

	public void setEmpId(int eid)
	{
		empid = eid;
	}
	
	//to view the data  
	public int getEmpId()
	{
		return empid;
	}
	
	//so here in one single unit(class) wrapping of data(emp_id) and the code acting on the data i.e. methods i.e. getters-setters is done.
	//So, a capsule is made. It is called encapsulation.
}

class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setEmpId(204);	//set the data
		System.out.println(e.getEmpId());		//view the data
	}

}

//204
//so, setters and getters gives security to the data.Also we can do further conditions inside getters and setters.