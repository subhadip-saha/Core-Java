package sp128_conversion_methods;

public class CaseAndTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//case conversion methods
		//toUpperCase() and toLowerCase()
		String s1 = "deepak";
		System.out.println(s1.toUpperCase());		//DEEPAK
		String s2 = "Subhadip";
		System.out.println(s2.toUpperCase());		//SUBHADIP
		
		String s3 = "SUBHAdip";
		System.out.println(s3.toLowerCase());		//subhadip
		
		//-------------------------------------------------------------------------
		
		//type conversion methods
		//valueOf() - it works for all datatypes - char,byte,long,float,double,object converted to string
		int a = 10; 
		String s4 = String.valueOf(a);		//valueOf() is static method that's why we call this method by class String
		System.out.println(s4);			//10
		
		boolean b = true;      
		String s5 = String.valueOf(b);
		System.out.println(s5);			//true
		
		char c = 'x';      //for all datatypes - long,float,double,object
		String s6 = String.valueOf(c);
		System.out.println(s6);			//x
		
		int x1=10, x2=20;
		System.out.println(x1+x2);			//30
		String y1 = String.valueOf(x1);
		String y2 = String.valueOf(x2);
		System.out.println(y1+y2);			//1020
		
		//chararray() - string converted to character array
		char chararray[] = s2.toCharArray();
		System.out.println(chararray);  	//Subhadip
	}

}
