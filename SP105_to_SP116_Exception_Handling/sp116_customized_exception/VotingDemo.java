package sp116_customized_exception;


//creating  CUSTOMIZED EXCEPTION of type UNCHECKED EXCEPTION/RUNTIME EXCEPTION
class UnderVotingAgeException extends RuntimeException
{
	//constructor overloading
	
	//no arg  ctor
	UnderVotingAgeException() 
	{
		//super is calling parent class constructor
		//as it is created by programmer, So, programmer provides this message
		super("You are under age!");
	}
	
	//parameterized ctor
	UnderVotingAgeException(String message) //if user wants their message to be printed it can be done here
	{
		//super is making the description available to default exception handler
		//now as a user we can send our own message in this way
		super(message);
	}
}


class VotingDemo {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 16;
		
		if(age < 18)
		{
				//want to print the message of - ctor w/o arguments 
			throw new UnderVotingAgeException();
		}
		else
		{
		  System.out.println("You can vote...");
		}
		System.out.println("check");
		
		//If, it is system's predefined unchecked exception class or our own made unchecked exception class, then we need not
		//to write try-catch or throws keyword.Program will be compiled successfully. In this case it will pass to  default excep handler
		//that means program will be successfully compiled but cannot be executed. if exception occurs then program will be terminated abnormally.
		//so we have to use try-catch to handle exception.
	}*/
	
	public static void main(String[] args) {
		int age = 16;
		try
		{
			if(age < 18)
			{
					//want to print the message of - ctor w/o arguments 
				throw new UnderVotingAgeException();
			}
			else
			{
			  System.out.println("You can vote...");
			}
		}
		catch(UnderVotingAgeException uvae)
		{
			uvae.printStackTrace();
		}
		
		System.out.println("check");
	}

}
