package sp116_customized_exception;

//creating  CUSTOMIZED EXCEPTION of type CHECKED EXCEPTION/COMPILE TIME EXCEPTION
class UnderAgeException extends Exception
{
	//constructor overloading
	
	//no arg  ctor
	UnderAgeException() 
	{
		//super is calling parent class constructor
		//as it is created by programmer, So, programmer provides this message
		super("You are under age!");
	}
	
	//parameterized ctor
	UnderAgeException(String message) //if user wants their message to be printed it can be done here
	{
		//super is making the description available to default exception handler
		//now as a user we can send our own message in this way
		super(message);
	}
}

public class Voting {

	/*public static void main(String[] args) {
		
		int age = 14;
		
		if(age < 18)
		{
				//want to print the message of - ctor w/o arguments 
			//throw new UnderAgeException();	//err: Unhandled exception type UnderAgeException
				//this program will not compile becuase it is checked exception and we should handle it with try-catch or throws keyword		
			
		}
		else
		{
		  System.out.println("You can vote...");
		}
		System.out.println("check");

	}*/
	
	//solution 1: 
	/*public static void main(String[] args) {
		
		int age = 14;
		try
		{
			if(age < 18)
			{
				throw new UnderAgeException();
			}
			else
			{
			  System.out.println("You can vote...");
			}
		}
		catch(UnderAgeException uae)
		{
			uae.printStackTrace();
		}
		System.out.println("check");
	}*/
	
	//solution 2: 
	/*public static void main(String[] args) throws UnderAgeException 
	{
		int age = 14;
		
		if(age < 18)
		{			
			throw new UnderAgeException();			
		}
		else
		{
		  System.out.println("You can vote...");
		}
		System.out.println("check");
	}*/
	
	//if you want to print a custom message - then 

	public static void main(String[] args) {
	
		int age = 14;
		try
		{
			if(age < 18)
			{
				throw new UnderAgeException("Sorry, You cannot vote!");
			}
			else
			{
			  System.out.println("You can vote...");
			}
		}
		catch(UnderAgeException uae)
		{
			uae.printStackTrace();
		}
		System.out.println("check");	//program normally terminate 
	}
	
	/*public static void main(String[] args) throws UnderAgeException 
	{
		int age = 14;
		
		if(age < 18)
		{			
			throw new UnderAgeException("Sorry, You cannot vote!");			
		}
		else
		{
		  System.out.println("You can vote...");
		}
		System.out.println("check");		//program abnormally terminate 
	}*/
}
