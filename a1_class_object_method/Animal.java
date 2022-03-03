//Example of classes, objects and methods and their calling 

package a1_class_object_method;

public class Animal {

	
	public void run()
	{
		System.out.println("The dog is running.");
	}
	
	public void eat()
	{
		System.out.println("The dog is eating.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main method");
		
		Animal an = new Animal();
		an.run();					//Typically an object of a class can call the methods of that class only using dot operator
		an.eat();					//this method signifies the animal's eat method 
		
		Bird bi = new Bird();
		bi.fly();
		
		//an.fly();					//An object of a class can not call the methods of another class
		
		bi.eat();					//this method signifies the bird's eat method, although the name can be same
		bi.prey();
	}

}

class Bird
{
	public void fly()
	{
		System.out.println("The eagle is flying.");
	}
	
	public void eat()
	{
		System.out.println("The pigeon is eating grains.");
	}
	
	public void prey()
	{
		System.out.println("The eagle's favourite prey is squirrel.");
	}
}
