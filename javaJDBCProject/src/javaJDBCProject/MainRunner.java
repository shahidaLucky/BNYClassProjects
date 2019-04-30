package javaJDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Register the Driver for java
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. Establish Connection to the Database
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "user_db";
		String password = "Pass123";

		Connection conn = DriverManager.getConnection(url, username, password);

		if (conn.isValid(1)) { // checking if the connection is valid
			System.out.println("You have a valid connection!");
		} else {
			System.out.println("Check your connection settings ");
		}

		// 3. Query the Database
		Statement myStatement = conn.createStatement();
		ResultSet rs; // declare a resultset object

		// assign the result of the sql statement to the resultset
		rs = myStatement.executeQuery("select * from JPAEMPLOYEE where EMPLOYEEID = 1");
		rs.next();
		System.out.println(rs.getInt(1) + "," + rs.getString(2)+ "," + rs.getString(3));

	}

}
