package sp_97_this_keyword;

/*
class Test
{
	int i;		// instance variable
	
	void setValue(int x)	// local variable
	{
		//instance variable and local variable names are different
		i = x;		//here we put value of the local variable to the instance variable.
	}
	
	void show()
	{
		System.out.println(i);
	}
}

class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.setValue(10);
		t.show();		//o/p: 10
	}

}

*/

//problem of not using this keyword
/*
class Test
{
	int i;		// instance variable
	
	void setValue(int i)	// local variable
	{
		//as instance variable and local variable names are same but now here both i are treated as local variable
		//So, we cannot put value of the local variable to the instance variable.
		i = i;		
	}
	
	void show()
	{
		System.out.println(i);	//printing the instance variable
	}
}

class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.setValue(10);
		t.show();		//o/p: 0 because default value of int type is printed
	}

}
*/

//now using this keyword

class Test
{
	int i;		// instance variable
	
	void setValue(int i)	// local variable
	{
		//now here this refers to the current class's instance variable 
		//So, now we can put value of the local variable to the instance variable.
		this.i = i;	//now lhs is instance variable and rhs is local variable	
	}
	
	void show()
	{
		System.out.println(i);	//printing the instance variable
	}
}

class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.setValue(10);
		t.show();		//o/p: 10
	}

}
/*
that means if we provide same name to both instance variable and local variable, then we can use this keyword to 
initialize value in the inst var from loc var

inst var is for object of the class, this keyword refers to the inst var which in turn refers to the object of the class
So, this keyword refers to the current class object. Fact proved.
this is reference variable for current class object and inst var is for object of the class.this.i refers to the instance variable
*/