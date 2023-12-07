package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreapredDelete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
		PreparedStatement preparedStatement=connection.
				prepareStatement("delete from User where id=?");
		System.out.println("Please enter id to be deleted");
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
	
		preparedStatement.setInt(1, id);
		
		preparedStatement.execute();
		connection.close();
		System.out.println("Deleted data successfully");
	
	}
}
