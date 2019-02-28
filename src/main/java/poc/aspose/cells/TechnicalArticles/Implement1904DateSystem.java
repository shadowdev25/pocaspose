package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class Implement1904DateSystem {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(Implement1904DateSystem.class) + "TechnicalArticles/";
		// Initialize a new Workbook
		Workbook workbook = new Workbook(dataDir + "Mybook.xlsx");

		// Implement 1904 date system
		workbook.getSettings().setDate1904(true);

		// Save the excel file
		workbook.save(dataDir + "I1904DateSystem_out.xls");

	}
}
