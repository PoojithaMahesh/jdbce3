package mavenjdbce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreapredMultipleInsertion {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbce3","root","root");
    PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
    
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("please enter how many enteries you want to store");
    int numberOfValues=scanner.nextInt();
    int i=0;
    
    while(i<numberOfValues) {
    	System.out.println("Please enter your id");
    	int id=scanner.nextInt();
    	System.out.println("Please enter your name");
    	String name=scanner.next();
    	System.out.println("please enter your address");
    	String address=scanner.next();
    	
    	preparedStatement.setInt(1, id);
    	preparedStatement.setString(3, address);
    	preparedStatement.setString(2, name);
//    	execute 
    	preparedStatement.execute();
    	i++;
    }
	connection.close();
	
	
	
}
}
