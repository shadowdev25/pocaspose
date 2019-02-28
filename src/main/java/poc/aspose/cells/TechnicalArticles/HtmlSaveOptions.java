package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class HtmlSaveOptions {
	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getDataDir(HtmlSaveOptions.class);
		Workbook wb = new Workbook(dataDir + "sample.xlsx");
		HtmlSaveOptions options = new HtmlSaveOptions();
		options.setStreamProvider(new ExportStreamProvider(dataDir));
		wb.save(dataDir + "out.html");

	}

	private void setStreamProvider(ExportStreamProvider exportStreamProvider) {
		// TODO Auto-generated method stub
		
	}
}
