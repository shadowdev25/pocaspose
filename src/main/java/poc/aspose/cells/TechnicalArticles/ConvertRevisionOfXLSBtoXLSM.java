package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ConvertRevisionOfXLSBtoXLSM {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ConvertRevisionOfXLSBtoXLSM.class) + "TechnicalArticles/";
		Workbook workbook = new Workbook(dataDir + "book1.xlsb");
		workbook.save(dataDir + "CROfXLSBtoXLSM_out.xlsm", SaveFormat.XLSM);

	}
}
