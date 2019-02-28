package poc.aspose.cells.Report2;

import com.aspose.cells.Cells;
import com.aspose.cells.Chart;
import com.aspose.cells.ChartType;
import com.aspose.cells.ListObjectCollection;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;
import poc.aspose.cells.TechnicalArticles.UsingExcelTables;

/**
 * 
 * @author houssem.gherbi
 * 
 * Creation d'une table et son histogramme correspondant (courbes également, aires, barres, etc)
 *
 */
public class CreateReportExcel2 {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UsingExcelTables.class) + "BP2S/";
		// Create an instance of Workbook
		Workbook book = new Workbook();
		// Access first worksheet from the collection
		Worksheet sheet = book.getWorksheets().get(0);
		// Access cells collection of the first worksheet
		Cells cells = sheet.getCells();

		// Insert data column wise
		cells.get("A1").putValue("Category");
		cells.get("A2").putValue("American");
		cells.get("A3").putValue("European");
		cells.get("A4").putValue("European");
		cells.get("A5").putValue("European");
		cells.get("A6").putValue("European");
		cells.get("A7").putValue("European");
		cells.get("A8").putValue("Asiatic");
		cells.get("A9").putValue("European");
		cells.get("A10").putValue("Asiatic");
		cells.get("A11").putValue("American");
		cells.get("A12").putValue("Asiatic");

		cells.get("B1").putValue("Countries");
		cells.get("B2").putValue("USA");
		cells.get("B3").putValue("UK");
		cells.get("B4").putValue("France");
		cells.get("B5").putValue("Germany");
		cells.get("B6").putValue("Italy");
		cells.get("B7").putValue("Spain");
		cells.get("B8").putValue("China");
		cells.get("B9").putValue("Russia");
		cells.get("B10").putValue("India");
		cells.get("B11").putValue("Canada");
		cells.get("B12").putValue("Japan");

		cells.get("C1").putValue("PIB(Tr$)");
		cells.get("C2").putValue(20.2);
		cells.get("C3").putValue(3.0);
		cells.get("C4").putValue(2.5);
		cells.get("C5").putValue(4.0);
		cells.get("C6").putValue(2.0);
		cells.get("C7").putValue(1.5);
		cells.get("C8").putValue(12.5);
		cells.get("C9").putValue(1.3);
		cells.get("C10").putValue(1.5);
		cells.get("C11").putValue(1.6);
		cells.get("C12").putValue(4.5);

		cells.get("D1").putValue("PIB/habitant(k$)");
		cells.get("D2").putValue(62.1);
		cells.get("D3").putValue(45.4);
		cells.get("D4").putValue(47.5);
		cells.get("D5").putValue(54.6);
		cells.get("D6").putValue(40.7);
		cells.get("D7").putValue(35.3);
		cells.get("D8").putValue(19.8);
		cells.get("D9").putValue(34.3);
		cells.get("D10").putValue(7.2);
		cells.get("D11").putValue(51.4);
		cells.get("D12").putValue(44.3);

		// Create ListObject. Get the List objects collection in the first worksheet
		ListObjectCollection listObjects = sheet.getListObjects();

		// Add a List based on the data source range with headers on
		int index = listObjects.add(0, 0, 11, 3, true);

		sheet.autoFitColumns();

		// Create chart based on ListObject
		index = sheet.getCharts().add(ChartType.COLUMN, 21, 1, 35, 18);
		Chart chart = sheet.getCharts().get(index);
		chart.setChartDataRange("A1:D12", true);
		chart.getNSeries().setCategoryData("A2:B12");

		// Calculate chart
		chart.calculate();

		// Save spreadsheet
		book.save(dataDir + "Report2.xlsx");
		
		System.out.println("Workbook with chart is successfully created.");

	}
}
