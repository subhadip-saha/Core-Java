package sp121_difference_equaltos_and_equals;

public class EqualtoEqualto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("deepak");
		String s2 = new String("deepak");
		//here it compares the reference/address
		System.out.println(s1 == s2);		//false
		//see image
		//here s1 and s2 (different reference variable) are not pointing to same object.(in proper heap area)
		
		
		String s3 = "amit";
		String s4 = "amit";
		//here it compares the reference/address
		System.out.println(s3 == s4);		//true		
		//here both s3 and s4 (different reference variable) are  pointing to same object in SCP/SLP(String constant/literal pool).
		
		System.out.println(s1 == s4); 	//false

		String s5 = "deepak";
		System.out.println(s1 == s5); 	//false, although contents are same but reference/address are not same, s1's object in proper heap area
		//and s5's object in SCP/SLP.
		
		// So, == operator is used for reference comparison or address comparison
		
		//here in String class, equals() method is for comparing the content of the object and 
		//== is for comparing the the reference/address.
	
		

	}

}
