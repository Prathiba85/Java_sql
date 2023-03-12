package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class updateexample2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "root");
java.sql.Statement stmt = con.createStatement();				
stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('Television', 16000.00, now())");

						
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
