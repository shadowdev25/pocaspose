package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class DisableCompatibilityChecker {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(DisableCompatibilityChecker.class) + "TechnicalArticles/";
		// Open a template file
		Workbook workbook = new Workbook(dataDir + "sample.xlsx");

		// Disable the compatibility checker
		workbook.getSettings().setCheckComptiliblity(false);

		// Saving the Excel file
		workbook.save(dataDir + "DCChecker_out.xls");

	}
}
