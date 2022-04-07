package sp121_difference_equaltos_and_equals;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * .equals() method is mathod of Object class(ultimate parent class)
		 */
		
		String s1 = new String("deepak");
		String s2 = new String("deepak");
		
		//here it checks the content of s1 and s2
		System.out.println(s1.equals(s2));	//true
		
		String s3 = "deepak";		
		System.out.println(s1.equals(s3));	//true
		
		String s4 = new String("ratul");
		System.out.println(s1.equals(s4));	//false
		
		String s5 = "james";
		System.out.println(s3.equals(s5));	//false

		//here in String class, equals() method is for comparing the content of the object and 
		//== is for comparing the the reference/address.
	}

}
