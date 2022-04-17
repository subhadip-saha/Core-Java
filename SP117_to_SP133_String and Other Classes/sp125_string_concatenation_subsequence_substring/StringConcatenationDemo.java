package sp125_string_concatenation_subsequence_substring;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//+ operator
		String s1 = "deepak";
		String s2 = " java";
		System.out.println(s1 + s2);		//deepak java
		System.out.println(s1 + 10);		//deepak10
		System.out.println(s1 + 10 + 20);	//deepak1020	//10 and 20 treated as string
		System.out.println(10 + 20 + s1);	//30deepak		//10 and 20 treated as integer atfirst, 30 with deepak treated as string
		System.out.println(10 + s1 + 20);	//10deepak20
		System.out.println(s1 + 20 / 10);	//deepak2
		System.out.println(s1 + 20 * 10);	//deepak200
		//System.out.println(s1 + 20 - 10);	//ERROR: deepak20 - 10 is not possible
		
		//concat() method
		System.out.println(s1.concat(s2));	//deepak java
		
		//join() method - here we are using String class(because it is static method), not s1 or s2 object
		//"," is delimiter and s1 and s2 are ...elements(varargs elements) means it can take multiple string arguments
		System.out.println(String.join(",", s1, s2));			//deepak, java
		System.out.println(String.join(",", s1, s2, s1, s2));	//deepak, java,deepak, java
		System.out.println(String.join(",", s1));				//deepak
		System.out.println(String.join(" ", s1, s2));			//deepak  java
		System.out.println(String.join("null", s1, s2));		//deepaknull java
		//System.out.println(String.join(null, s1, s2));		//java.lang.NullPointerException, delimiter cannot be null
		String s3 = null;
		System.out.println(String.join(";", s3, s2));	//null; java
	}

}
