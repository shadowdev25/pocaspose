package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ImportXMLMap {
	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(ImportXMLMap.class) + "TechnicalArticles/";
		// Create a workbook
		Workbook workbook = new Workbook();

		// URL that contains your XML data for mapping
		String XML = "http://www.aspose.com/docs/download/attachments/434475650/sampleXML.txt";

		// Import your XML Map data starting from cell A1
		workbook.importXml(XML, "Sheet1", 0, 0);

		// Save workbook
		workbook.save(dataDir + "ImportXMLMap_out.xlsx");

	}
}
