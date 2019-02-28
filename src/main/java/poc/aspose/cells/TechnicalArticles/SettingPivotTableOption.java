package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.PivotTable;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class SettingPivotTableOption {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingPivotTableOption.class) + "TechnicalArticles/";
		Workbook wb = new Workbook(dataDir + "input.xlsx");
		PivotTable pt = wb.getWorksheets().get(0).getPivotTables().get(0);
		// Indicating if or not display the empty cell value
		pt.setDisplayNullString(true);
		// Indicating the null string
		pt.setNullString("null");
		pt.calculateData();
		pt.setRefreshDataOnOpeningFile(false);
		wb.save(dataDir + "SettingPivotTableOption_out.xlsx");

	}
}
