package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Hyperlink;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

public class EditingHyperlinksOfWorksheet {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(EditingHyperlinksOfWorksheet.class) + "TechnicalArticles/";
		Workbook workbook = new Workbook(dataDir + "source.xlsx");
		Worksheet worksheet = workbook.getWorksheets().get(0);
		for (int i = 0; i < worksheet.getHyperlinks().getCount(); i++) {
			Hyperlink hl = worksheet.getHyperlinks().get(i);
			hl.setAddress("http://www.aspose.com");
		}
		workbook.save(dataDir + "EHOfWorksheet_out.xlsx");

	}
}
