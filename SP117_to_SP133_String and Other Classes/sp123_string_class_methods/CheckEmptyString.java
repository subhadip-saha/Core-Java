//Check String is Empty Or Not

package sp123_string_class_methods;

public class CheckEmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method 1:
		//length() method finds out no. of characters
		String name = "";
		int len = name.length();
		if(len == 0)
			System.out.println("name is empty");
		else
			System.out.println("valid name");
		
		//method 2:
		boolean bool = name.isEmpty();
		if(bool)	// or, if(bool == true) or if(name.isEmpty())
			System.out.println("name is empty");
		else
			System.out.println("valid name");
		
		//method 3:
		int l = name.trim().length();
		if(l == 0)
			System.out.println("name is empty");
		else
			System.out.println("valid name");
		
		
		//why to use trim()
		String name2 = "     ";	
		//int len2 = name2.length();	//although it is blankspace but still output is valid name, but it is wrong, so we have to trim it to remove blankspaces
		int len2 = name2.trim().length();	//now it shows name is empty, which is correct	
		if(len2 == 0)
			System.out.println("name is empty");
		else
			System.out.println("valid name");
		
		//you can also check in this way
		String name3 = "     ";	
		//if(name3.isEmpty())				//it shows valid name - which is wrong
		//if(name3.trim().isEmpty())			//now it shows name is empty, which is correct	
		//or you can use isBlank() method - it automatically removes blankspaces, no need to trim 
		if(name3.isBlank())					//name is empty
			System.out.println("name is empty");
		else
			System.out.println("valid name");
	}

}
