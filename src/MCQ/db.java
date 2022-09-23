package MCQ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		System.out.println("\'");
		
		String qa = "a";
		
		String a = "my"+"d\'"+qa+"\'d";
		
		System.out.println(a);
		
		String b = "insert into questions values ((select count(*) from questions)+1,"+"\'"+qa+"\'"+"\'"+qa+"\'"+"\'"+qa+"\'"+"\'"+qa+"\'"+"\'"+qa+"\'";
		
		System.out.println(b);
		
	}
	
	public static void updateQuery()throws ClassNotFoundException, SQLException

	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	
		String url = "jdbc:sqlserver://agl78\\sqlexpress;databasename=mcq;user=sa;password=ATE186@agaramtech";

		Connection conn= DriverManager.getConnection(url);
		
		Statement statement = conn.createStatement();
		
		statement.executeUpdate("insert into questions values ((select count(*) from questions)+1,'question','a','b','c','d'	)");
		

	}
	
	public static void selectQuery() throws ClassNotFoundException, SQLException
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

		
		int maximumValue = Integer.parseInt(count);
		
		System.out.println(maximumValue);
	}
}
