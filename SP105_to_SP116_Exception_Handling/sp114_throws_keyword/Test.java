package sp114_throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
	
	
	/*void readFile() 
	{

		FileInputStream fis = new FileInputStream("f:/abc.txt"); //err
		//other statements
	}*/
	
	
	/*void readFile() //program compiles but we want other method should handle the exception
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
	
	
	
	/*void saveFile()
	{
		String text = "Hi, this is demo";	
		FileOutputStream fos = new FileOutputStream("f:/xyz.txt"); //err
		//other statements
	}*/
	
	
	
	/*void saveFile() //program compiles but we want other method should handle the exception
	{
		try
		{
			String text = "Hi, this is demo";	
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

class Test 
{

	/*public static void main(String[] args) 
	{
		ReadAndWrite rw = new ReadAndWrite();
		
		//should handle the exception using throws or try-catch
		//rw.readFile();	 //err
		//rw.saveFile();	 //err
		//System.out.println("check 1 ");
		//System.out.println("check 2 ");
	}*/

	
	/*public static void main (String[] args) throws FileNotFoundException
	{
		ReadAndWrite rw = new ReadAndWrite();
		
		// handle the exception using throws but program will terminates abnormally
		rw.readFile();	
		rw.saveFile();
		System.out.println("check 1 ");		//these lines will not be printed
		System.out.println("check 2 ");
	}*/
	
	public static void main (String[] args) throws FileNotFoundException
	{
		ReadAndWrite rw = new ReadAndWrite();
		
		// handle the exception using try-catch but program will terminates normally
		try
		{
			rw.readFile(); 
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		System.out.println("check 1 ");	//check normal termination
		
		//similarly do for saveFile();	
		try
		{
			rw.saveFile(); 
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}
		System.out.println("check 2 ");	//check normal termination*
	
	}

}

/*
java.io.FileNotFoundException: f:\abc.txt (The system cannot find the file specified)
at java.base/java.io.FileInputStream.open0(Native Method)
at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
at throws_keyword.ReadAndWrite.readFile(Test.java:35)
at throws_keyword.Test.main(Test.java:107)
check 1 
check 2 
*/