package sp124_comparing_two_strings;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//equals() returns boolean
		String s1 = "Deepak";
		String s2 = "Deepak";
		System.out.println(s1.equals(s2));
		String s3 = "deepak";					//case sensitive, equals() considers upper and lower case differently
		System.out.println(s1.equals(s3));
		String s4 = "Amit";
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equals(""));
		
		/*
			true
			false
			false
			false
		*/
		
		//achieving empty validation by equals()
		String name = "";
		if(name.equals(""))
			System.out.println("name is empty");	//name is empty
		else
			System.out.println("valid name");		
		
		//NOTE: real world use case: equals() method is used to match emailid and password
		
		//equalsIgnoreCase() returns boolean
		System.out.println(s1.equalsIgnoreCase(s3));	//true, equalsIgnoreCase() does not consider upper and lower case		
		String s5 = "DEEPAK";
		System.out.println(s1.equalsIgnoreCase(s5));	//true
		
		//we can checks whether the string is empty or not. 
		System.out.println(s1.equals(""));	//false , s1 is not empty (here s1 is compared with "" -> empty string)
		
		
		//-------------------------------------------------------------------------------------------------------------
		
		//compareTo() method returns integer
		//compares lexicographically - means strings are converted into decimal/unicode
		String str1 = "a";	//97
		String str2 = "A";	//65
		System.out.println(str1.compareTo(str2)); //32
		
		//it measn if we get o/p 0, then str1 == str2 , +ve value (str1 > str2), -ve value (str1 < str2)
		
		String str3 = "abc";	//97
		String str4 = "Abc";	//65
		System.out.println(str3.compareTo(str4)); //32
		
		String str5 = "aB";	
		String str6 = "aC";	
		System.out.println(str5.compareTo(str6)); //32
		
		//compareTo() first compares first character, if they are equal then compares second char
		//compare b/w: ab-ab = 0, ab-Ab = 32, ab-AB = 32, aB-AB = 32, aB-ab = -32, aB-aC = -1 (B is 66 and C is 67, so 66-67=-1)
		
		//compareToIgnoreCase() also compares lexicographically but it ignores cases
		String str7 = "B";	
		String str8 = "b";	
		System.out.println(str7.compareToIgnoreCase(str8));		//0 because compareToIgnoreCase() treats A and a equally
		//compare b/w: aB-aC = -1,  aB=Ab = 0, B-b = 0
		
		//tricky question: compareTo() returns length if one of the two strings is empty 
		
		String st1 = "deepak";
		String st2 = "";		//empty string
		System.out.println(st1.compareTo(st2));	//6
	}

}
