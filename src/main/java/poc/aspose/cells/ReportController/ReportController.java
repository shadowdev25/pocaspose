package poc.aspose.cells.ReportController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "createTable", method = RequestMethod.GET)
	public void createTable() {
		try {
			jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS REGISTRATION " + "(id INTEGER auto_increment, "
					+ " first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))");

			System.out.print("Table Created");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@RequestMapping(value = "putData", method = RequestMethod.GET)
	public void putData() {
		try {
			jdbcTemplate.execute("INSERT INTO REGISTRATION (id, first, last, age) VALUES (1, 'houssem', 'gherbi', 30)");
			
			System.out.print("Table Updated");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
