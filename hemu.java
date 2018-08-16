package harinijdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class hemu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try
				{		
				Class.forName("com.mysql.jdbc.Driver");
				}
				 catch(ClassNotFoundException cnfex) {
			            System.out.println("Problem in loading MySQL JDBC driver");
			            cnfex.printStackTrace();
			        }
				//opening database connection
				try{
					//create and get connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dogs","root","");
				//create JDBC statement
				Statement stmt = con.createStatement();
				//executing SQL and retrieve data
				ResultSet rs= stmt.executeQuery("select * from breeds");
				//processing and print data
				while(rs.next())
				{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				}
				con.close();
				}
				catch(SQLException e)
				{
					System.out.println(e);
			}
	}
}