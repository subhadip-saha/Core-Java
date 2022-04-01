//analyzing throws keyword with FileInputStream

package sp114_throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadAndWrite1
{
	//below code will not compile.As FileInputStream is checked/compile-time exception, so we must provide handling code.
	//otherwise, error: Unhandled exception: FileNotFoundException must be caught or declared to be thrown
	
	/*//this method reads data from a file
	 * void readFile() 
	{
		FileInputStream fis = new FileInputStream("f:/abc.txt"); //err
		//other statements
	}*/
	
	//Solution of above is either try-catch or throws keyword 
	//using try-catch means, I personally handling this exception.So, now program will compile successfully.
	//But, I want other developer who wants to use this readFile() method, he/she should handle this exception.
	//I do not want to  handle this exception and for that use throws keyword
	/*
	 * void readFile() 
	{
		try
		{
			FileInputStream fis = new FileInputStream("f:/abc.txt");
			//other statements 
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		
	}*/
	
	//using throws keyword, So, now also program will compile successfully.
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("f:/abc.txt");
		//other statements
	}
	
}
public class Test1 {
	
	//here also we did not handle exception using try-catch, program terminates abnormally
	/*public static void main(String[] args) throws FileNotFoundException {

		ReadAndWrite1 rw1 = new ReadAndWrite1();

		//rw1.readFile(); //Unhandled exception type FileNotFoundException
		
		//main() method can also throws FileNotFoundException , now jvm will terminate the program abnormally
		rw1.readFile(); 

		System.out.println("check 1 ");	//check normal termination*/

/*		Exception in thread "main" java.io.FileNotFoundException: d:\abc.txt (The system cannot find the file specified)
		at java.base/java.io.FileInputStream.open0(Native Method)
		at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
		at throws_keyword.ReadAndWrite1.readFile(Test1.java:42)
		at throws_keyword.Test1.main(Test1.java:56)
*/
		
		//here we handled exception using try-catch, so, program terminates normally
	public static void main(String[] args) {

		ReadAndWrite1 rw1 = new ReadAndWrite1();
		//it says readFile() method throws FileNotFoundException, so you have to handle it
		//rw.readFile();  //error: Unhandled/unreported exception: FileNotFoundException, must be caught or declared to be thrown
		
		//so use enclose it with try-catch, now program successfully compiles, and when you run it,
		// - it provides proper o/p: it says the system cannot find the file specified and prints the entire stacktrace
		try
		{
			rw1.readFile(); //now readFile() throws exception because abc.txt file is not in f:,but we handle exception and print check 1 on console, means program terminates normally
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		System.out.println("check 1 ");	//check normal termination
	}

}
/* Now program will be successfully compiled and executed and normally terminated

java.io.FileNotFoundException: d:\abc.txt (The system cannot find the file specified)
at java.base/java.io.FileInputStream.open0(Native Method)
at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
at throws_keyword.ReadAndWrite.readFile(Test.java:39)
at throws_keyword.Test1.main(Test1.java:57)
check 1 
*/
