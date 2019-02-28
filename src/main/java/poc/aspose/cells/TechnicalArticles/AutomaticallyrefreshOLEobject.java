package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

public class AutomaticallyrefreshOLEobject {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AutomaticallyrefreshOLEobject.class) + "TechnicalArticles/";

		// Create workbook object from your sample excel file
		Workbook wb = new Workbook(dataDir + "sample.xlsx");

		// Access first worksheet
		Worksheet sheet = wb.getWorksheets().get(0);

		// Set auto load property of first ole object to true
		sheet.getOleObjects().get(0).setAutoLoad(true);

		// Save the worbook in xlsx format
		wb.save(dataDir + "ARefreshOLEobject_out.xlsx", SaveFormat.XLSX);

	}

}
