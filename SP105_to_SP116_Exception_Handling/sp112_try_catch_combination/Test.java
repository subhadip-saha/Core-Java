package sp112_try_catch_combination;



class Test 
{
	
	public static void main(String[] args) 
	{
		
	//try - catch - finally => individually cannot exist.
		
		// try without catch or finally
		/*try 		//error
		{
		}*/
		
		// catch without try
		/*catch		//error
		{
		}*/
		
		// finally without try
		/*finally		//error
		{
		}*/
		
		/*try
		{
		}
		catch(Exception e)		
		{
		}*/
		
		//same exception need not to catch more than once
		//exception Exception has already been caught . It is already handled by the catch block for Exception
		/*try
		{
		}
		catch(Exception e)		
		{
		}
		catch(Exception e)	//err	
		{
		}*/
		
		/*try
		{
		}	
		//same exception class should not be provided in catch block multiple times
		catch(ArithmeticException ae)		
		{
		}
		catch(ArithmeticException ae)	//err	
		{
		}*/
		
		//exception ArithmaticException has already been caught .
		//So, first catch block has parent Exception class then below all catch blocks are of no use. because all exceptions will be handled by parent Exception class in first catch block 
		/*try
		{
		}
		catch(Exception e)		
		{
		}	
		catch(ArithmeticException ae)		//error
		{
		}*/
		
		/*try	//no error because first catch block catches child exception class, second catch block catches parent exception class
		{
		}
		catch(ArithmeticException ae)		
		{
		}
		catch(Exception e)		
		{
		}*/	

		/*try	//valid
		{
		}	
		catch(Exception e)	//exception can be handled
		{
		}
		finally
		{
		}*/
		
		//catch without try because try-finally make a valid block, So, catch block is alone
		/*try     //wrong structure
		{
		}	
		finally		
		{
		}
		catch(Exception e)		//err	
		{
		}*/
		
		//to remove above err - add try again or remove finally or change structure 
		/*try     
		{
		}	
		finally		
		{
		}
		try    
		{
		}
		catch(Exception e)		
		{
		}*/
		
		//nested try-catch
		/*try	
		{
			try
			{
			}
			catch(Exception e)		
			{
			}
		}
		catch(ArithmeticException ae)		
		{
		}*/
		
		/*try	
		{

		}
		catch(ArithmeticException ae)		
		{
			try
			{
			}
			catch(Exception e)		
			{
			}
		}*/
		
		
		/*try	
		{
			try
			{
			}
			catch(Exception e)		
			{
			}
		}
		catch(ArithmeticException ae)		
		{
			try
			{
			}
			catch(Exception e)		
			{
			}
		}*/
		
		/* try-catch inside finally
		try 
		{
		}	
		catch(ArithmeticException ae)			//outer exception can be handled
		{
		}
		finally
		{
			try
			{
			}	
			catch(Exception e)			//inner exception can be handled
			{
			}
		}*/
		
		/*try
		{
		}	
		finally		//outer exception cannot be handled now as no catch block
		{
			try			//try-catch inside finally block 
			{
			}	
			catch(Exception e)		//inner exception can be handled
			{
			}
		}*/
		
		//in b/w of try-catch if any other line=> error: try without catch or catch without try
		/*try
		{
		}
		System.out.println("hello"); 
		catch(Exception e)		
		{
		}*/	
		
		//in b/w of try-catch-finally if any other line=> error: try without catch or catch without try or finally withut try
		/*try
		{
		}
		System.out.println("hello"); 
		catch(Exception e)		
		{
		}
		finally		
		{
		}*/
	}

}


//-------------------------------------------

//-------------------------------------------

//-------------------------------------------

//-------------------------------------------

//-------------------------------------------

//-------------------------------------------