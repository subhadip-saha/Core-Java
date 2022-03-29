//try-catch-finally used with FileInputStream

package sp110_finally_block;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.IIOException;

public class FileCloseDemo {

	public static void main(String[] args) throws IOException 
	{
	//setting null at first
		FileInputStream fis = null;
		try
		{
			//opening the resource - opening file abc.txt for reading the data 
			fis = new FileInputStream("f:/abc.txt");
		}
		catch(FileNotFoundException e)
		{
			//if exception happens (means when file does not exist in the location), then prints it
			System.out.println("file not found");
		}
		//here we are using throws keyword for exception thrown by close() inside finally block
		finally		 //alternately you can use try-catch inside finally block
		{
			//cleanup code
			if(fis != null)	//means fis is opened, So close it 
				fis.close();	//as close() throws an IOException - //we can also use try-catch instead of throws keyword
			
			System.out.println("file found");	//So, fis is not null means file found
		}
	}

}
