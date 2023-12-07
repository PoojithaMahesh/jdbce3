package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchExecution {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
	Scanner scanner=new Scanner(System.in);
	System.out.println("please enter a number that how many entries you want to add");
	int numberOfValues=scanner.nextInt();
	int i=0;
	while(i<numberOfValues) {
		System.out.println("please enter ypur id");
		int id=scanner.nextInt();
		System.out.println("please enter your name");
		String name=scanner.next();
		System.out.println("please eneter your address");
		String address=scanner.next();
		preparedStatement.setInt(1, id);
		preparedStatement.setString(3, address);
		preparedStatement.setString(2,  name);
		
		preparedStatement.addBatch();
		System.out.println("added to the batch and observe im not adding it to the database");
		i++;
	}
	preparedStatement.executeBatch();
	connection.close();
	
	
	
}
}
