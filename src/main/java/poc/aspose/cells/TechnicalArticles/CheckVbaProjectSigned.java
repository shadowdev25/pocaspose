package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class CheckVbaProjectSigned {

	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(CheckVbaProjectSigned.class) + "TechnicalArticles/";
		String inputPath = dataDir + "Sample1.xlsx";

		Workbook workbook = new Workbook(inputPath);

		System.out.println("VBA Project is Signed: " + workbook.getVbaProject().isSigned());

	}
}
