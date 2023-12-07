package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a Query
    statement.execute("update User set name='poojithajm' where id =1");
//  5.Close the connection
    connection.close();
    System.out.println("data updated sucessfully");
}
}
