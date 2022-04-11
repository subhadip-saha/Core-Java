package sp122_string_class_constructors;

public class StringClassConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"red", "blue"};
		System.out.println(str); 			//[Ljava.lang.String;@73a28541
		
		
		//different types of String class ctor
		//1.No argument ctor - it creates an empty String class object
		String s = new String(); 	//empty String ctor
		System.out.println(s);		//nothing will be printed - an empty space
		
		//checking string object is empty or not by verifying its length, if length = 0, empty
		System.out.println(s.length());	//0
	
		
		//2.String literal ctor
		String s2 = new String("deepak");
		System.out.println(s2);				//deepak
		System.out.println(s2.length()); 	//6
		
		//3. 
		StringBuffer sbf = new StringBuffer("deepak");
		System.out.println(sbf);	//deepak
		
		//4.
		StringBuilder sbl = new StringBuilder("deepak");
		System.out.println(sbl);	//deepak 
		
		//Note: StringBuffer and creates mutable object but String creates immutable object
		//changing mutable to immutable object 		
		String s3 = new String(sbf);
		String s4 = new String(sbl);
		
		//5.byte array
		byte b[] = {101,102,103};
		System.out.println(b);  		//[B@6f75e721
		//byte array can be passed in String ctor
		String s5 = new String(b);
		System.out.println(s5);  	//efg
		
		//6.char array
		char c[] = {'b','l','u','e'};
		System.out.println(c);  				//blue
		//char array can be passed in String ctor
		String s6 = new String(c);			//String is a sequence of chars, so an string object is created with value blue
		System.out.println(s6);  	//blue
	}	

}
