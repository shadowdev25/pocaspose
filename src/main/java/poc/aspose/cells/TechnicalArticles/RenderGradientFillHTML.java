package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.*;
import poc.aspose.cells.Utils;

public class RenderGradientFillHTML {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RenderGradientFillHTML.class) + "TechnicalArticles/";

		//Read the source excel file having text with gradient fill
		Workbook wb = new Workbook(dataDir + "sourceGradientFill.xlsx");

		//Save workbook to html format
		wb.save(dataDir + "out_sourceGradientFill.html");
	}
}
