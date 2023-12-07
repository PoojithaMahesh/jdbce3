package mavenjdbce3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
		CallableStatement callableStatement=connection.prepareCall("call selectuser()");
		ResultSet resultSet=callableStatement.executeQuery();
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString(3));
		}
		
		
		connection.close();
		System.out.println("data selected successfully with the help of CallableStatement");
	}
}
