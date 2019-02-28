package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class UsingMaxDataRowAndMaxDataColumn {
	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(UsingMaxDataRowAndMaxDataColumn.class) + "TechnicalArticles/";
		// Load a file in an instance of Workbook
		Workbook book = new Workbook(dataDir + "sample.xlsx");

		// Get Cells collection of first worksheet
		Cells cells = book.getWorksheets().get(0).getCells();

		// Loop over all cells
		for (int row = 0; row < cells.getMaxDataRow(); row++) {
			for (int col = 0; col < cells.getMaxDataColumn(); col++) {
				// Read the Cell value
				System.out.println(cells.get(row, col).getStringValue());
			}
		}

	}
}
