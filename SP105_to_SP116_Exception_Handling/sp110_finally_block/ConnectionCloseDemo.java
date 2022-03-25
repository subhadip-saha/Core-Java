package sp110_finally_block;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionCloseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try
		{
			//Do something like opening connection  and connect with db and write some query create/insert/read/update/delete 
		}
		catch(Exception e)
		{
			//exception handling code
		}
		//here we are using try-catch to close all the resources and for exception thrown by close() inside finally block
		finally	 //alternately you can use throws inside finally block
		{
			try
			{
				rs.close();
			}
			catch(SQLException se)
			{
				/* ignored */
			}
			try
			{
				ps.close();
			}
			catch(SQLException se)
			{
				/* ignored */
			}
			try
			{
				con.close();
			}
			catch(SQLException se)
			{
				/* ignored */
			}
		}
	}

}
