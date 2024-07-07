/*
 * single: B extends from A
 * 
	object of class A can call only methods of its own class A i.e. showA()
	but object of class B can call methods of its own class B i.e. showB()
	as well as methods of A i.e. showA()
 */

package a12_single_inheritance;

class A													//parent class or super class
{
	void showA()
	{
		System.out.println("class A method");
	}
}

class B extends A										//child class or sub class
{
	void showB()
	{
		System.out.println("class B method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		A obj1 = new A();
		obj1.showA();
		//obj1.showB();				//cannot call method of class B by using object of class A
		System.out.println("-----------------------------");
		B obj2 = new B();
		obj2.showA();				//as inheritance is used, so  object of class B can call methods of its own class B 			
		obj2.showB();				//i.e. showB() as well as methods of A i.e. showA()
	}

}
