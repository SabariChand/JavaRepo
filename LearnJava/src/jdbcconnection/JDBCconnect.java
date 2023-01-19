package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String QUERY = "Select * from students";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sabaridb","root","rootMe@1");
			System.out.println("Connected With the database successfully");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			{		      
		         while(rs.next())
		         {
						System.out.print("Stu_id: " + rs.getInt("stu_id"));
			            System.out.print(", stu_name: " + rs.getString("stu_name"));
			            System.out.print(", Gender: " + rs.getString("gender"));
			            
		         }
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
