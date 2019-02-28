package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Color;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

public class SetWorksheetTabColor {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetWorksheetTabColor.class) + "TechnicalArticles/";
		// Instantiate a new Workbook
		Workbook workbook = new Workbook(dataDir + "Book1.xls");
		// Get the first worksheet in the book
		Worksheet worksheet = workbook.getWorksheets().get(0);
		// Set the tab color
		worksheet.setTabColor(Color.getRed());
		// Save the Excel file
		workbook.save(dataDir + "worksheettabcolor.xls");

	}
}
