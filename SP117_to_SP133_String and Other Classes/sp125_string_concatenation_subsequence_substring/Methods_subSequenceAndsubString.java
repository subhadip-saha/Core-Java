package sp125_string_concatenation_subsequence_substring;

public class Methods_subSequenceAndsubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "This is Demo";	//count starts from 0
		
		//subSequence() returns char sequence
		System.out.println(s1.subSequence(3, 9));	//s is D 	//from 3 to (9-1)
		System.out.println(s1.subSequence(0, 0));		//empty string
		//System.out.println(s1.subSequence(3, -1));	//java.lang.StringIndexOutOfBoundsException:
		
		//substring() returns string
		System.out.println(s1.substring(3));	//s is Demo 	//from 3rd index upto end
		System.out.println(s1.substring(3, 11));	//s is Dem 	//from 3rd index to (11-1)		
		System.out.println(s1.substring(3, 12));		//s is Demo 	//from 3rd index to (12-1)
		System.out.println(s1.substring(0, 0));		//empty string
		//System.out.println(s1.substring(3, -1));	////java.lang.StringIndexOutOfBoundsException:
		
	}

}
