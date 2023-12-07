package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteUpdate {
public static void main(String[] args) throws Exception {
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
//// 3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.Execute a query
//	int value=statement.executeUpdate("insert into User values(101,'gulshan','mysore')");
////  5.Close the connection
//	System.out.println(value);
//	connection.close();
//	System.out.println("yes data inserted successfully");
	
	
	
	
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.Execute a Query
//    statement.executeUpdate("update User set name='poojitha' where id =1");
////  5.Close the connection
//    connection.close();
//    System.out.println("data updated sucessfully");
	
	
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
//// 3.Create a Statement
//	
//	Statement statement=connection.createStatement();
////	4.Execute the queries
//	int value=statement.executeUpdate("Delete from User where id=3");
//
//	System.out.println(value);
//	System.out.println("Yes deleted successfully");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
	Statement statement=connection.createStatement();
	int a=statement.executeUpdate("Select * from User");
	
	
	connection.close();
	System.out.println("yes done selected");

	

	
	
	
	
	
	
	
	
}
}
