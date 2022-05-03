package sp130_stringbuilder_class;

public class StringBuilderClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//In StringBuilder, all methods are same like StringBuffer(here all the methods are synchronized)
		
		//but here all the methods are non-synchronized
		StringBuilder sbl = new StringBuilder();	//empty
		System.out.println(sbl.capacity());			//16
		System.out.println(sbl);		//gives empty space
		System.out.println(sbl.length());	//0
		
		sbl.append("yellow");						
		System.out.println(sbl.capacity());			//16
		System.out.println(sbl);				//yellow
		System.out.println(sbl.length());	//6
		
		StringBuilder sbl2 = new StringBuilder("Pink");	
		System.out.println(sbl2.capacity());			//20
		
		System.out.println(sbl2.length());	//4
	}

}
