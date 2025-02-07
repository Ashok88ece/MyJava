package MustKnownJavaConcepts;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExamples {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apr_02", "root", "root");
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("SELECT * FROM apr_02.action");
		
		while(result.next()) {
			
			System.out.println("ActionId:"+result.getString(1) + "   " +"Action Name:" +result.getString(2) + "   " +"IsActive:" +result.getString(3));
		}

	}

}
