//object initialization by using methods

package a3_object_initialization;	

public class Animal {

	String color;
	int age;
	
	void initObj(String c, int a)
	{
		color = c;
		age = a;
	}
	
	void display()
	{
		System.out.println(color + " " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal buzo = new Animal();	
		buzo.initObj("GoldenBrown", 5); ;
		buzo.display();
				
	}

}

