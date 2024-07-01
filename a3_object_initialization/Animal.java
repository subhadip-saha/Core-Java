//object initialization by using methods

package a3_object_initialization;	

public class Animal {

	String color;
	int age;
	
	void initObj(String c, int a)	//declaring methods and passing parameters
	{
		color = c;		//value initialized inside instance variable
		age = a;		//value initialized inside instance variable
	}
	
	void display()
	{
		System.out.println(color + " " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal buzo = new Animal();	
		buzo.initObj("GoldenBrown", 5); ;	//calling the method and passing arguments
		buzo.display();
				
	}

}

