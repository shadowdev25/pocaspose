package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class CheckVBAProjectInWorkbookIsSigned {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CheckVBAProjectInWorkbookIsSigned.class) + "TechnicalArticles/";
		Workbook workbook = new Workbook(dataDir + "source.xlsm");
		System.out.println("VBA Project is Signed: " + workbook.getVbaProject().isSigned());


	}
}
