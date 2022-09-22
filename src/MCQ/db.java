package MCQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	
			String url = "jdbc:sqlserver://agl78\\sqlexpress;databasename=mcq;user=sa;password=ATE186@agaramtech";

			Connection conn= DriverManager.getConnection(url);
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery("select count(*) from questions");
			
			String count = "";
		
			while(result.next())
			{
				count=count+result.getString(1);
			}
 
			
			int countInt = Integer.parseInt(count);
			
			System.out.println(countInt);
	
	}
}
