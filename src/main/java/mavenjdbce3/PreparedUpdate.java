package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedUpdate {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("update User set name=? where id=?");
	System.out.println("Please enter id to be updated");
	Scanner scanner=new Scanner(System.in);
	int id=scanner.nextInt();
	System.out.println("enter the name");
	String name=scanner.next();
	
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, id);
	
	preparedStatement.execute();
	connection.close();
	System.out.println("Updated data successfully");
	
	
	
	
	
	
	
}
}
