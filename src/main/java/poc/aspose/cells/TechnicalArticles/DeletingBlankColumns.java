package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;
import poc.aspose.cells.Utils;

public class DeletingBlankColumns {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(DeletingBlankColumns.class) + "TechnicalArticles/";
		// Create a new Workbook. Open an existing excel file.
		Workbook wb = new Workbook(dataDir + "Book1.xlsx");

		// Create a Worksheets object with reference to the sheets of the Workbook.
		WorksheetCollection sheets = wb.getWorksheets();

		// Get first Worksheet from WorksheetCollection
		Worksheet sheet = sheets.get(0);

		// Delete the Blank Columns from the worksheet
		sheet.getCells().deleteBlankColumns();

		// Save the excel file.
		wb.save(dataDir + "DBlankColumns_out.xlsx");

	}
}
