package MCQ;

import java.awt.DisplayMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MCQ {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String url = "jdbc:sqlserver://agl78\\sqlexpress;databasename=mcq;user=sa;password=ATE186@agaramtech";

		Connection conn= DriverManager.getConnection(url);
		
		Statement statement = conn.createStatement();
		
		ResultSet  result = statement.executeQuery("select * from questions");
		
		ArrayList <String>question = new ArrayList();
		
		ArrayList <String>answerA = new ArrayList();

		ArrayList <String>answerB = new ArrayList();

		ArrayList <String>answerC = new ArrayList();

		ArrayList <String>answerD = new ArrayList();

		while(result.next())
		{
			
			String a = result.getString(1);
			String b = result.getString(2);
			String c = result.getString(3);
			String d = result.getString(4);
			String e = result.getString(5);
			
			question.add(a);
			answerA.add(b);
			answerB.add(c);
			answerC.add(d);
			answerD.add(e);
			

			
		}

		for (String i : question)
		{
			System.out.println(i);
		}

		for (String i : answerA)
		{
			System.out.println(i);
		}
		
		for (String i : answerB)
		{
			System.out.println(i);
		}

		for (String i : answerC)
		{
			System.out.println(i);
		}

		for (String i : answerD)
		{
			System.out.println(i);
		}



	}

}
