package sp114_throws_keyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite2
{
	//Similarly, It will also not compile.As FileOutputStream is checked/compile-time exception, so we must provide handling code.
	//otherwise, error: Unhandled exception: FileNotFoundException, must be caught or declared to be thrown
	/*
	 * void saveFile()
	{
		String text = "Hi, this is demo";	//this text to be saved inside xyz.txt, for that write other codes
		FileOutputStream fos = new FileOutputStream("f:/xyz.txt"); //err
		//other statements
	}*/
	
	//Solution of above is either try-catch or throws keyword 
	//using try-catch means, I personally handling this exception.So, now program will compile successfully.
	//But, I want other developer who wants to use this readFile() method, he/she should handle this exception.
	//for that use throws keyword
	/*
	 * void saveFile() 
	{
		try
		{
			String text = "Hi, this is demo";	//this text to be saved inside xyz.txt, for that write other codes
			FileOutputStream fos = new FileOutputStream("f:/xyz.txt");
			//other statements
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		
	}*/
	
	//using throws keyword, So, now also program will compile successfully.
	void saveFile() throws FileNotFoundException
	{
		String text = "Hi, this is demo";	//this text to be saved inside xyz.txt, for that write other codes
		FileOutputStream fos = new FileOutputStream("f:/xyz.txt");
		//other statements
	}
}
public class Test2 {
	
	//here also we did not handle exception, program terminates abnormally
	/*public static void main(String[] args) throws FileNotFoundException {
		

		ReadAndWrite2 rw2 = new ReadAndWrite2();
		//rw2.saveFile(); //Unhandled exception type FileNotFoundException
		
		//main() method can also throws FileNotFoundException , now jvm will terminate the program abnormally
		rw2.saveFile();
		
		System.out.println("check 2 ");	//check normal termination*/


		//here we did handled exception, program terminates normally
	public static void main(String[] args) {
	

		ReadAndWrite2 rw2 = new ReadAndWrite2();
		//it says readFile() method throws FileNotFoundException, so you have to handle it
		//rw.readFile();  //error: Unhandled/unreported exception: FileNotFoundException, must be caught or declared to be thrown
		
		//so use enclose it with try-catch, now program successfully compiles, and when you run it,
		// - it provides proper o/p: it says the system cannot find the file specified and prints the entire stacktrace
		try
		{
			rw2.saveFile(); 	//now saveFile() does not throw exception anymore, it will save the file in f: and print check 2 on console, means program terminates normally
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		System.out.println("check 2 ");	//check normal termination*/
	
	}

}

//check 2