//object initialization by using reference variable

package a2_object_initialization;	

public class Animal {

	String color;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal buzo = new Animal();	
		buzo.color = "GoldenBrown";
		buzo.age = 5;
		
		System.out.println(buzo.color + " " + buzo.age);
		
	}

}

