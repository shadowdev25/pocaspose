package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

public class ShowFormulas {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ShowFormulas.class) + "TechnicalArticles/";
		// Load the source workbook
		Workbook workbook = new Workbook(dataDir + "source.xlsx");

		// Access the first worksheet
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Show formulas of the worksheet
		worksheet.setShowFormulas(true);

		// Save the workbook
		workbook.save(dataDir + "ShowFormulas_out.xlsx");

	}
}
