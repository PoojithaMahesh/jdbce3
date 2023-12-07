package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSaveUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your id");
	int id=scanner.nextInt();
	System.out.println("Please enter your name");
	String name=scanner.next();
	System.out.println("Please enter your address");
	String address=scanner.next();
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setString(3, address);
	boolean value=preparedStatement.execute();
	System.out.println(value);
	connection.close();
System.out.println("yes data inserted successfully with the preparedStatement");
	
	
	
}
}
