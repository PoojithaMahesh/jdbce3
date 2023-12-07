package mavenjdbce3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableUpdate {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
	CallableStatement callableStatement=connection.prepareCall("call updateUser('pooji',1)");
	callableStatement.execute();
	connection.close();
	System.out.println("data updated successfully with the help of CallableStatement");
}
}
