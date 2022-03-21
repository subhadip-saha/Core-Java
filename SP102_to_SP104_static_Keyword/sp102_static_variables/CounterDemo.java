package sp102_static_variables;

//The static variable gets memory only once in the class area at the time of class loading

/*
//The no. of times we create object of CounterDemo, that many no. of times CounterDemo() ctor will be called and increments value of count 
class CounterDemo {

	int count = 0;
	
	CounterDemo() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterDemo cd1 = new CounterDemo();	// it automatically calls default ctor , if we don't provide it compiler added implicitly
		CounterDemo cd2 = new CounterDemo();
		CounterDemo cd3 = new CounterDemo();
		CounterDemo cd4 = new CounterDemo();
	}

}


1
1
1
1

It prints 1 for each and every object. When we created first object, count instance variable is memory allocated inside cd1. Now second time again
When we created second object, count instance variable is memory allocated inside cd2 again. Again for cd3,cd4 and for all of them count value is initialized with 0,
*/

//But we want count to be initialized with 0 only once. And its value will be incremented.

class CounterDemo {

	static int count = 0;		//now count becomes class level variable, not for object
	
	CounterDemo() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterDemo cd1 = new CounterDemo();	// it automatically calls default ctor , if we don't provide it compiler added implicitly
		CounterDemo cd2 = new CounterDemo();
		CounterDemo cd3 = new CounterDemo();
		CounterDemo cd4 = new CounterDemo();
	}

}

/*
1
2
3
4
*/