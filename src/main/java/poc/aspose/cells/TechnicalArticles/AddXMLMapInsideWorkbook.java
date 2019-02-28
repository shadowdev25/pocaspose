package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class AddXMLMapInsideWorkbook {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddXMLMapInsideWorkbook.class) + "TechnicalArticles/";
		// Create workbook object
		Workbook wb = new Workbook();

		// Add xml map found inside the sample.xml inside the workbook
		wb.getWorksheets().getXmlMaps().add(dataDir + "sample.xml");

		// Save the workbook in xlsx format
		wb.save(dataDir + "AddXMLMapInsideWorkbook_out.xlsx");
	}
}
