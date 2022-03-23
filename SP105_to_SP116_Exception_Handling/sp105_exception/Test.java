//Exception example in a program.

package sp105_exception;


// Normal flow of program
/*
 public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(100/20);
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println(10);
		System.out.println("Normal flow");
		
	}

}
*/

//exception occurs
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(100/0);	//exception occurs in this line
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println(10);
		System.out.println("Normal flow");
		
	}

}