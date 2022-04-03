//Difference Between throw and throws in Java

package sp115_throw_vs_throws;



//For throw keyword, we use customized exception generally
//RuntimeException class is unchecked exception, So, YoungerAgeException class is unchecked exception

//creating customized exception 
/*class YoungerAgeException extends RuntimeException
{
	//constructor
	YoungerAgeException(String msg)
	{
		//msg is passed to default exception handler
		super(msg);
	}
}

class Test {

	public static void main(String[] args) {
		
		int age = 16;
		
		if(age < 18)
		{
			//here throw keyword is used to create exception object manually by programmer.If age < 18, then programmer creates an exception object
			//which holds 3 things - excp clsnm, excp desc, excp stcktrc. Here main() does not create excp obj 
			//we should not write any statement after throw keyword. It will give unreachable code.
			throw new YoungerAgeException("You are not eligible to vote");
			//System.out.println("hello hi bye bye"); //error: Unreachable code
		}
		else
		{
			System.out.println("You can vote");
		}
		/*try
		{
			if(age < 18)
			{
				//we should not write any statement after throw keyword. It will give unreachable code.
				throw new YoungerAgeException("You are not eligible to vote");
				//System.out.println("hello hi bye bye"); //error: Unreachable code
			}
		else
			{
				System.out.println("You can vote");
			}
		}

		catch(YoungerAgeException yae)	
		{
			yae.printStackTrace();
		}/*
		
		System.out.println("check"); 
	}

}*/

//---------------------------------------------
//throws keyword tells the caller method of readFile() i.e. main() method that as you're using readFile() method, it may throws FileNotFoundException. 
//So, handle it by using try-catch. 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("f:/abc.txt");
		//other statements
	}
	
}
public class Test {
	public static void main(String[] args) {

		ReadAndWrite rw = new ReadAndWrite();
		//rw.readFile();
		//throws indicates the caller method FileNotFoundException may arrise, so handle with try-catch ir throws further
		try
		{
			rw.readFile(); //now readFile() throws exception because abc.txt file is not in f:,but we handle exception and print check 1 on console, means program terminates normally
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		System.out.println("check 1 ");	
	}
}