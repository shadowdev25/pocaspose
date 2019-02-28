package poc.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.h2.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "mypassword");
		System.out.println("Database created");
	}

}
