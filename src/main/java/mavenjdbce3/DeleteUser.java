package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {
public static void main(String[] args) throws Exception{
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
// 3.Create a Statement
	
	Statement statement=connection.createStatement();
//	4.Execute the queries
	statement.execute("Delete from User where id=3");

	
	System.out.println("Yes deleted successfully");
	


}
}
