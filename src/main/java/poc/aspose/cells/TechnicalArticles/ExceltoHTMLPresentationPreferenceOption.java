package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ExceltoHTMLPresentationPreferenceOption {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExceltoHTMLPresentationPreferenceOption.class) + "TechnicalArticles/";
		// Instantiate the Workbook
		// Load an Excel file
		Workbook workbook = new Workbook(dataDir + "HiddenCol.xlsx");

		// Create HtmlSaveOptions object
		ImplementingIStreamProvider options = new ImplementingIStreamProvider();

		// Set the Presenation preference option
		options.setPresentationPreference(true);

		// Save the Excel file to HTML with specified option
		workbook.save(dataDir + "EToHPPOption_out.html");

	}
}
