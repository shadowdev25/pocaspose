package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.HtmlLinkTargetType;
import com.aspose.cells.HtmlSaveOptions;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ChangeHtmlLinkTarget {

	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(ChangeHtmlLinkTarget.class) + "TechnicalArticles/";
		String inputPath = dataDir + "Sample1.xlsx";
		String outputPath = dataDir + "CHLinkTarget.html";

		Workbook workbook = new Workbook(inputPath);

		HtmlSaveOptions opts = new HtmlSaveOptions();
		opts.setLinkTargetType(HtmlLinkTargetType.SELF);

		workbook.save(outputPath, opts);

		System.out.println("File saved " + outputPath);

	}
}
