package mavenjdbce3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery("Select * from User");
	
	while(resultSet.next()) {
		
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		
	}
	connection.close();
	System.out.println("yes done selected");
}
}
