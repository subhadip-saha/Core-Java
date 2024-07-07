/*
 * Multilevel: C extends from B, B extends from A
		So, indirectly C extends from A
		object of class A can call only methods of A i.e. showA()
		but object of class B can call methods of B i.e. showB()
		as well as methods of A i.e. showA() and object of class C can call methods of its own class i.e. C i.e. 
		showC() as well as methods of B i.e. showB() and methods of A i.e. showA()
 */

package a13_multilevel_inheritance;

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

}

class C extends B 										//child class or sub class
{
	void showC()
	{
		System.out.println("class C method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		A obj1 = new A();
		obj1.showA();
		//obj1.showB();				//cannot call method of class B by using object of class A
		//obj1.showC();				//cannot call method of class C by using object of class A
		System.out.println("-----------------------------");
		B obj2 = new B();
		obj2.showA();				 			
		obj2.showB();				
		//obj2.showC();				//cannot call method of class C by using object of class B
		System.out.println("-----------------------------");
		C obj3 = new C();
		obj3.showA();				 			
		obj3.showB();				
		obj3.showC();
	}

}
