package classWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainEmployeeRunner {

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

		List<Employee> employeeList = new ArrayList<Employee>();// Making list of employee

		// 3. Query the Database
		Statement myStatement = conn.createStatement();
		ResultSet rs; // declare a resultset object

		// This block is for getting one record of the Employee from DB
		/***
		 * assign the result of the sql statement to the resultset for single record
		 * ------//rs = myStatement.executeQuery("select * from JPAEMPLOYEE where
		 * EMPLOYEEID = 5"); rs.next(); rs = myStatement.executeQuery("select * from
		 * JPAEMPLOYEE where EMPLOYEEID = 5");
		 ******************/

		// To get all the Employee record from the DB
		rs = myStatement.executeQuery("select * from JPAEMPLOYEE order by EMPLOYEEID ");

		while (rs.next()) {
			Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			employeeList.add(employee);
		}

		// for print
		for (Employee e : employeeList) {
			e.printEmployee();
		}

		// System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," +
		// rs.getString(3));
		// employee.printEmployee();

	}

}
