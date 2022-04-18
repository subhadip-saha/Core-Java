package sp126_replacing_and_removing_characters;

public class StringUpdationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "This is Demo";
		//old string(is) is replaced with new string(was)
		System.out.println(s1.replace("is", "was"));	//Thwas was Demo
		//old character(s) is replaced with new character(n)		
		System.out.println(s1.replace('s', 'n'));	//Thin in Demo
		
		//replace first occurrence of string - replaceFirst() can't be used with char
		System.out.println(s1.replaceFirst("is", "was"));	//Thwas is Demo
		
		//replace all occurrences of mentioned string, - replaceAll can't be used with char
		System.out.println(s1.replaceAll("is", "was"));	//Thwas was Demo
		
		//difference b/w replace() and replaceAll()
		//In replaceAll() we can provide regex(regular expressions) but in replace() we can't 
		//. means jekhane is paoa jabe sekhane was diye replace korbe and space o remove kore debe 
		System.out.println(s1.replaceAll("is(.)", "was"));	//ThwaswasDemo
		//.* means jekhanei prothom is paoa jabe, seta ke was diye replace korbe and tar pore puro expression ta ke remove kore debe
		System.out.println(s1.replaceAll("is(.*)", "was"));	//Thwas
		
		//No Error: But, it won't work Regex will not work with replace(). it matches the characters exactly. 
		//is(.) treated as a string and it cannot find any string like is(.)So, it cannot match.
		System.out.println(s1.replace("is(.*)", "was"));	//This is Demo
		
		String s2 = "This is(.) Demo";
		System.out.println(s2.replace("is(.)", "was"));	//This was Demo
		//Error: Regex can't be used with character
		//System.out.println(s1.replace('s(.)', 'n'));
	}

}
