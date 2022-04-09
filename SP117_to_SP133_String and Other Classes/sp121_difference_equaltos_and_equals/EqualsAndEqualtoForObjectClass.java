package sp121_difference_equaltos_and_equals;

public class EqualsAndEqualtoForObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1 == obj2);		//false
		System.out.println(obj1.equals(obj2));	//false
		
		//So, for Object class .equals() method and == are same  i.e it compares the reference or address.
	}

}
