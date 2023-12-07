package mavenjdbce3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableInsert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3", "root", "root");

		CallableStatement callableStatement = connection.prepareCall("call insertUser(1007,'ppoo','zyz')");
		callableStatement.execute();
		connection.close();
		System.out.println("Data inserted successfully with the help of callablestaement");

	}
}
