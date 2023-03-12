package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Inserexample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "root");
java.sql.Statement stmt = con.createStatement();				
stmt.executeUpdate("update eproduct set price=7000.00 where name='Tablet'" );

						
				ResultSet result = stmt.executeQuery("select * from eproduct");
				while (result.next())
				{
					System.out.println("Product ID "+result.getInt("ID"));
					System.out.println("Product name "+result.getString("name"));
					System.out.println("Price "+result.getDouble("price"));
				}
				
				con.close();

	}

}
