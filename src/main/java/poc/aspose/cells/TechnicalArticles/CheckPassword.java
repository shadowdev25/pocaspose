package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.LoadOptions;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class CheckPassword {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CheckPassword.class) + "TechnicalArticles/";

		// Specify password to open inside the load options
		LoadOptions opts = new LoadOptions();
		opts.setPassword("1234");

		// Open the source Excel file with load options
		Workbook workbook = new Workbook(dataDir + "Book1.xlsx", opts);

		// Check if 567 is Password to modify
		boolean ret = workbook.getSettings().getWriteProtection().validatePassword("567");
		System.out.println("Is 567 correct Password to modify: " + ret);

		// Check if 5678 is Password to modify
		ret = workbook.getSettings().getWriteProtection().validatePassword("5678");
		System.out.println("Is 5678 correct Password to modify: " + ret);

	}
}
