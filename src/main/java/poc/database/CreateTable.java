package poc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "mypassword");
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE T_ADDRESS (\r\n" + 
					"  ID             BIGINT(19) PRIMARY KEY,\r\n" + 
					"  CREATION_TIME  TIMESTAMP   NOT NULL,\r\n" + 
					"  CREATED_BY     VARCHAR(50) NOT NULL,\r\n" + 
					"  UPDATED_TIME   TIMESTAMP   NOT NULL,\r\n" + 
					"  UPDATED_BY     VARCHAR(50) NOT NULL,\r\n" + 
					"  ADDRESS_LINE_1 VARCHAR(50) NOT NULL,\r\n" + 
					"  ADDRESS_LINE_2 VARCHAR(50),\r\n" + 
					"  ADDRESS_LINE_3 VARCHAR(50),\r\n" + 
					"  CITY           VARCHAR(50) NOT NULL,\r\n" + 
					"  COUNTRY        VARCHAR(7),\r\n" + 
					"  ZIP_CODE       INTEGER(4)  NOT NULL\r\n" + 
					")";
			
			stmt.execute(sql);
			System.out.print("Table Created");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

}
