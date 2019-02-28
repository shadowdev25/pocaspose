package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class RenderCustomDateFormat {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RenderCustomDateFormat.class) + "TechnicalArticles/";

		Workbook workbook = new Workbook(dataDir + "DateFormat.xlsx");
		workbook.save(dataDir + "out.pdf");

	}
}
