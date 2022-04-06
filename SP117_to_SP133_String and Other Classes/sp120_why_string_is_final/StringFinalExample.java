package sp120_why_string_is_final;

public class StringFinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sbf = new StringBuffer("Deepak");
		System.out.println(sbf);	//Deepak
		sbf.append(" Java");
		System.out.println(sbf);	//Deepak Java
		
		/*
		 * Deepak
		 * Deepak Java
		 */
		
		final StringBuffer sbf2 = new StringBuffer("Deepak");
		System.out.println(sbf2);	//Deepak
		sbf2.append(" Java");
		System.out.println(sbf2);	//Deepak Java
		
		/*
		 * Deepak
		 * Deepak Java
		 */
		
		//Unlike String class, StringBuffer class is not immutable and that;s why we can change its object value.
		//final keyword has no effect on immutability.
		//till now we cannot understand use if final, both o/p same
		//So, the main problem is referencing  
		
		StringBuffer sbf3 = new StringBuffer("Deepak");
		System.out.println(sbf3);	//Deepak
		sbf3 = sbf3.append(" Java");
		System.out.println(sbf3);	//Deepak Java
		
		/*
		 * Deepak
		 * Deepak Java
		 */
		
		//above, sbf3 is pointing to new object Deepak Java
		
		final StringBuffer sbf4 = new StringBuffer("Deepak");
		System.out.println(sbf4);
		//sbf4 = sbf4.append(" Python");	//error, because, now object is made final, so we sbf4 cannot refer to another object Deepak Python
		System.out.println(sbf4);
		
		//concept of final reference variable = we cannot reassign sbf4 to another object, This is the concept of final in String
		//but we can change its value by just writing sbf.append(" Java"); So, Deepak => Deepak Java. So, value of the object is changed
		//that means StringBuffer class not a immutable class
	}

}
