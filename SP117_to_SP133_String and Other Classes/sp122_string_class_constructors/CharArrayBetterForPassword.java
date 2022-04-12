package sp122_string_class_constructors;

public class CharArrayBetterForPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char ch[] = new char[] {'a','b','c'};	//abc is password
		System.out.println("ch[] = " + ch);			//[C@73a28541	//!! it prints object
		System.out.println(ch);					//abc 		//!!
		
		String str = new String("abc");
		System.out.println(str);		//abc	//string object can directly get the password 
		
		String strPwd = "password";
        char[] charPwd = new char[] {'p','a','s','s','w','o','r','d'};
         
        System.out.println("String password: " + strPwd );
        System.out.println("Character password: " + charPwd);
	}
	

}
