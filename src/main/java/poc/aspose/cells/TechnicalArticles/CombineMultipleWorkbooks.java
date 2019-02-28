package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class CombineMultipleWorkbooks {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CombineMultipleWorkbooks.class) + "TechnicalArticles/";
		// Open the first excel file.
		Workbook SourceBook1 = new Workbook(dataDir + "charts.xlsx");

		// Define the second source book.
		// Open the second excel file.
		Workbook SourceBook2 = new Workbook(dataDir + "picture.xlsx");

		// Combining the two workbooks
		SourceBook1.combine(SourceBook2);

		// Save the target book file.
		SourceBook1.save(dataDir + "CMWorkbooks_out.xlsx");

	}
}
