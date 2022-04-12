//String Class Methods (length(), isEmpty() & trim()) In Java 

package sp123_string_class_methods;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//length() method - returns integer
		String name = "deepak";
		System.out.println(name.length());
		String name2 = "";					//empty string object
		System.out.println(name2.length());
		String name3 = " ";
		System.out.println(name3.length());
		//String name4 = null;				
		//System.out.println(name4.length());	// java.lang.NullPointerException
		
		
		/*
			6
			0
			1
		*/
		
		
		//isEmpty() method	- returns boolean
		System.out.println(name.isEmpty());		//false
		System.out.println(name2.isEmpty());	//true
		System.out.println(name3.isEmpty());	//false
		//System.out.println(name4.isEmpty());	// java.lang.NullPointerException
		/*
			false
			true
			false
		*/
		
		
		//trim() method		- returns String
		String str1 = "Blue";
		System.out.println(str1.trim());
		String str = ""; //String str = " ";
		System.out.println(str.trim());	//empty space
		String str2 = " Blue";
		System.out.println(str2.trim());
		String str3 = "Blue ";
		System.out.println(str3.trim());
		String str4 = " Blue ";
		System.out.println(str4.trim());
		String str5 = " Blue is the warmest    colour ";
		System.out.println(str5.trim());
		
		/*
		 * trim method removes spaces at starting and ending but cannnot remove space in between
			Blue
			Blue
			Blue
			Blue
			Blue is the warmest    colour
		*/
		
		
	}

}
