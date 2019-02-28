package poc.aspose.cells.Report4;

import com.aspose.cells.BackgroundType;
import com.aspose.cells.Color;
import com.aspose.cells.PivotTable;
import com.aspose.cells.Style;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

/**
 * 
 * @author houssem.gherbi
 * 
 * Customisation d'une table croisée.
 *
 */
public class CreateReportExcel4 {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CreateReportExcel4.class) + "BP2S/";
		// Create workbook object from source file containing pivot table
		Workbook workbook = new Workbook(dataDir + "pivotTable_test.xlsx");

		// Access the worksheet by its name
		Worksheet worksheet = workbook.getWorksheets().get("PivotTable");

		// Access the pivot table
		PivotTable pivotTable = worksheet.getPivotTables().get(0);

		// Create a style object with background color light blue
		Style style = workbook.createStyle();
		style.setPattern(BackgroundType.SOLID);
		style.setBackgroundColor(Color.getLightBlue());

		// Format entire pivot table with light blue color
		pivotTable.formatAll(style);

		// Create another style object with yellow color
		style = workbook.createStyle();
		style.setPattern(BackgroundType.SOLID);
		style.setBackgroundColor(Color.getYellow());

		// Format the cells of the first row of the pivot table with yellow color
		for (int col = 0; col < 5; col++) {
			pivotTable.format(1, col, style);
		}

		// Save the workbook object
		workbook.save(dataDir + "Report4.xlsx");

	}
}
