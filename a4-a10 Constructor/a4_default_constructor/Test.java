//default constructor or no argument constructor provided by the compiler

package a4_default_constructor;

public class Test {

	int i;
	String s;
	
	//here we cannot write sopln
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();	//although we did not provide any ctor, compiler provides default ctor automatically
		System.out.println(t.i + " " + t.s);		//that's why default values are assigned in i and s 
	}

}
