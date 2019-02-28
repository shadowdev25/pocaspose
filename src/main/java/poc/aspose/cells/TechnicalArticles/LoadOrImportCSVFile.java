package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.TxtLoadOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

public class LoadOrImportCSVFile {
	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(LoadOrImportCSVFile.class) + "TechnicalArticles/";
		String csvFile = dataDir + "sample.csv";

		TxtLoadOptions opts = new TxtLoadOptions();
		opts.setSeparator(',');
		opts.setHasFormula(true);

		// Load your CSV file with formulas in a Workbook object
		Workbook workbook = new Workbook(csvFile, opts);

		// You can also import your CSV file like this. The code below is importing CSV file starting from cell D4
		Worksheet worksheet = workbook.getWorksheets().get(0);
		worksheet.getCells().importCSV(csvFile, opts, 3, 3);

		// Save your workbook in Xlsx format
		workbook.save(dataDir + "LOrICSVFile_out.xlsx");

	}
}
