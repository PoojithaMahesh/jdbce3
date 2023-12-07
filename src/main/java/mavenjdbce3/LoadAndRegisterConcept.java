package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterConcept {
public static void main(String[] args) throws SQLException {
//	1.Load and Register the Driver
//	a.Load the Driver
	Driver driver=new  Driver();
//	b.Register the Driver
	DriverManager.registerDriver(driver);
	
//	2.establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.Execute a Query
	statement.execute("insert into User values(1001,'pooji','mysore')");
//	5.Close the connection
	connection.close();
	System.out.println("inserted user details by loading and registering the Driver Explicitily");
	
	
	
}
}
