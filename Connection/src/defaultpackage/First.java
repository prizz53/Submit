package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class First {
	
	public static void main(String[] args)
	
	{
		Connection con = null;
		
		String Connection_Uri = "jdbc:mysql://localhost:3306/Student_records";
		String Username = "root";
		String password = "P@ssw0rd@123";
		
		try{
		con = (Connection)DriverManager.getConnection(Connection_Uri,Username,password);
	
		if(con!=null)
		System.out.println("Connection Successful");
		}
		catch(Exception e)
			{
				System.out.println("Not Connected");
			}
}

}
