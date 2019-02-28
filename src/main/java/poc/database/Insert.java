package poc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "mypassword");
			Statement stmt = con.createStatement();
			String sql = "insert into REGISTRATION(first, last, age) values('python','java', 24),"
					+ "('jQuery','Angularjs', 10)";
			int i = stmt.executeUpdate(sql);
			System.out.println(i+ "Record inserted");
		}
		catch (Exception e) {
		
			System.err.println(e.getMessage());
		}
	}

}
