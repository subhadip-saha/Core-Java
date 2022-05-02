package sp129_stringbuffer_class;

public class StringBufferClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String can be created in 4 ways -
		//1. Using String class
		String str = new String("Deepak");		//or, //String str = "Deepak";
		System.out.println(str);
		
		//2. Using character array
		//String is sequence of characters, we can represent a string in this way also
		char ch[] = new char[] {'r','e','d'};	//or, //char ch[] = {'r','e','d'};
		System.out.println(ch);
		
		//Change is not possible in original String class object, if you try it will allocate another memory.
		//That's why it is called String objects are immutable. Old String object values cannot be changed, if you try it to do, it will create a new object. 
		String name = "Deepak";		//here an object is created and its value is Deepak
		str.concat("Roy");			//here another new object is created and its value is DeepakRoy, it will not add old Deepak object
		
		//3. Using StringBuffer class
		StringBuffer sbf = new StringBuffer("Deepak");		//sbf is pointing to a memory location where Deepak is stored
		sbf.append("Gupta");	//now, unlike String class, StringBuffer will not create a new object, rather it will change in the original objects
		
		/* NOTE: in notepad,msword - we change values frequently - then use StringBuffer  -space will be saved 
		 * String objects are immutable. 
		 * but in registration form - name,emailid,address,gender etc. we will not change more often, so use string.
		 * StringBuffer objects are mutable.
		 */
		
		StringBuffer sbf2 = new StringBuffer();	//empty StringBuffer
		
		///The capacity() method of Java StringBuffer class returns the current capacity of the string buffer.
		// The capacity refers to the total amount of characters storage size in string buffer.
		System.out.println(sbf2.capacity());		//16 (default capacity)
		System.out.println(sbf.capacity());			//22 (16+6=22) => default capacity + string length
		
		StringBuffer sbf3 = new StringBuffer(10);	//we can also provide no. of characters(initial capacity) beforehand
		System.out.println(sbf3.capacity());	//10
		sbf3.append("Strawberry");
		System.out.println(sbf3);
		sbf3.append("Red"); // it will not show any error if we provide values more than its capacity
		System.out.println(sbf3);
		System.out.println(sbf3.capacity());
		
		StringBuffer sbf4 = new StringBuffer();
		System.out.println(sbf4.capacity());		//16
		sbf4.append("hello");
		System.out.println(sbf4.capacity());		//16
		sbf4.append("hello world");
		System.out.println(sbf4.capacity());		//16
		sbf4.append("hello world Java");
		System.out.println(sbf4.capacity());		//34 (if capacity > 16, then new capacity = 16 * 2 + 2) = 34
		/*
		 * new capacity = old capacity * 2 + 2
		 * new capacity = (old capacity + 1) * 2  
		 */
		
		//capacity() refers to the total amount of characters StringBuffer object can hold
		StringBuffer sbf5 = new StringBuffer();
		System.out.println(sbf5.capacity());		//16
		//length() refers to the no. of characters present StringBuffer object at present
		System.out.println(sbf5.length());			//0
		StringBuffer sbf6 = new StringBuffer("Green");
		System.out.println(sbf6.capacity());		//21
		System.out.println(sbf6.length());			//5
		
		sbf6.append("Light");
		System.out.println(sbf6);	//GreenLight
		System.out.println(sbf6.charAt(3));		//e
		System.out.println(sbf6.delete(0, 5));	//Light , deletes from 0 to 5-1
		System.out.println(sbf6.deleteCharAt(1));	//Lght
		
		StringBuffer sbf7 = new StringBuffer("World");
		StringBuffer sbf8 = new StringBuffer("World");
		System.out.println(sbf7.equals(sbf8));	//false because sbf7 and sbf8 refers to different objects
		//if they refers same object then o/p true
		StringBuffer sbf9 = sbf7.append("Map");
		System.out.println(sbf7.equals(sbf9));	//true, sbf7 and sbf9 refers to same object
		
		//equals() method in StringBuffer class, checks that references are pointing to the same object or not.
		//equals() method in String class, checks that the contents are same or not
		
		System.out.println(sbf8.indexOf("w"));	//-1
		System.out.println(sbf8.indexOf("W"));	//0
		StringBuffer sbf10 = new StringBuffer("orangecolour");
		System.out.println(sbf10.indexOf("r"));	//1
		System.out.println(sbf10.lastIndexOf("r"));	//11
		
		System.out.println(sbf10.insert(3, "XXX"));	//oraXXXngecolour
		
		System.out.println(sbf10.replace(3, 6, "YYY"));	//oraYYYngecolour
		
		//reverse() method is for StringBuffer class, not for String class
		System.out.println(sbf10.reverse());	//ruolocegnYYYaro
		System.out.println(sbf10.reverse());	//oraYYYngecolour
		
		System.out.println(sbf10.subSequence(3, 6));	//YYY
		System.out.println(sbf10.substring(6));		//ngecolour
		System.out.println(sbf10.substring(6, 12));		//ngecol
		
		sbf10.setCharAt(4, 'Q');		//oraYQYngecolour
		System.out.println(sbf10);		////as it returns void, so we cannot write inside sopln directly
		
		sbf10.setLength(4);
		System.out.println(sbf10);	//oraY
	
		
		StringBuffer sbf11 = new StringBuffer();
		System.out.println(sbf11.capacity());		//16
		sbf11.ensureCapacity(100);			//as it returns void, so we cannot write inside sopln directly
		System.out.println(sbf11.capacity());		//100
		
		sbf11.append("Mango");
		System.out.println(sbf11.capacity());	//100 	//although capacity is 100, we used only 5 characters, remaining would be wastage
		//to remove those wastage, 
		sbf11.trimToSize();	//helps to release extra memory
		System.out.println(sbf11.capacity());		//5 , now memory is saved
		
	}

}
