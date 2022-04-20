package sp127_searching_methods;

public class SearchingMethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//indexOf()
		String s = "deepak";
		
		//indexOf() returns integer
		//we can provide character value in argument and returns index
		System.out.println(s.indexOf('d'));		//0
		System.out.println(s.indexOf('e'));		//1 	//returns first e index
		System.out.println(s.indexOf('p'));		//3
		System.out.println(s.indexOf("p"));			//3		//single character can also be string
		System.out.println(s.indexOf("c"));			//-1	//c is not present in deepak
	
		//we can provide also string value in argument and return index of a string, first char index of string 
		System.out.println(s.indexOf("ep"));		//2
		System.out.println(s.indexOf("ak"));		//4
		
		//lastIndexOf() - it finds the character from last to first, and return its index. 
		System.out.println(s.lastIndexOf('e'));		//2		//returns last e index
		System.out.println(s.lastIndexOf('p'));		//3
		System.out.println(s.lastIndexOf("pa"));		//3		//works with string also
		System.out.println(s.lastIndexOf('z'));		//-1	//z is not present in deepak
		//Explanation: In deepak, only one p - so indexOf('p') and lastIndexOf('p') returns same value
		
		//indexOf() searches from first and lastIndexOf() searches from last and print index.
		String s1 = "abcb";
		System.out.println(s1.indexOf('b'));		//1	//first b
		System.out.println(s1.lastIndexOf('b'));	//3	//last b
		System.out.println(s1.lastIndexOf("cb"));		//2		//works with string also
		
		//charAt() takes integer value as input and return character
		System.out.println(s.charAt(3));		//p	//returns character of 3rd index
		//System.out.println(s.charAt(9));		// java.lang.StringIndexOutOfBoundsException:
		
		//contains() check the provided string/'char sequence' is present in s or not and returns boolean
		System.out.println(s.contains("ep"));	//true		//deepak contains ep string in it
		System.out.println(s.contains("ip"));	//false
		System.out.println(s.contains("k"));	//true
		//System.out.println(s.contains('e'));		//does not work with character 
		
		//startsWith() takes string argument but return boolean
		System.out.println(s.startsWith("d"));	//true	//deepak starts with d
		System.out.println(s.startsWith("a"));	//false
		System.out.println(s.startsWith("dee"));	//true	
		System.out.println(s.startsWith("ee"));		//false
		//System.out.println(s.startsWith('d'));	////does not work with character 
		
		//endsWith() takes string argument but return boolean
		System.out.println(s.endsWith("ee"));		//false
		System.out.println(s.endsWith("ak"));		//true
		System.out.println(s.endsWith("k"));		//true
	}

}
