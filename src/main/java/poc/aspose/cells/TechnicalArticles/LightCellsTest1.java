package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.LightCellsDataHandler;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;


public class LightCellsTest1 {
	public static void main(String[] args) throws Exception {
		String dataDir = Utils.getSharedDataDir(LightCellsTest1.class) + "TechnicalArticles/";
		LoadOptions opts = new LoadOptions();
		LightCellsDataHandlerVisitCells v = new LightCellsDataHandlerVisitCells();
		opts.setLightCellsDataHandler((LightCellsDataHandler) v);
		Workbook wb = new Workbook(dataDir + "LargeBook1.xlsx", opts);
		int sheetCount = wb.getWorksheets().getCount();
		System.out.println("Total sheets: " + sheetCount + ", cells: " + v.cellCount + ", strings: " + v.stringCount
				+ ", formulas: " + v.formulaCount);

	}
}
