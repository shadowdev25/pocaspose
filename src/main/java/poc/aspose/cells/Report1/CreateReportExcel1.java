package poc.aspose.cells.Report1;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.PivotFieldType;
import com.aspose.cells.PivotTable;
import com.aspose.cells.PivotTableCollection;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import poc.aspose.cells.Utils;

/**
 * 
 * @author houssem.gherbi
 * 
 * Création d'une table et sa table croisée avec la classe "PivotTableCollection" d'Aspose.Cells
 *
 */
public class CreateReportExcel1 {
	public static void main(String[] args) throws Exception {
		
		// The path to the resource directory
		String dataDir = Utils.getSharedDataDir(CreateReportExcel1.class) + "BP2S/";
				
		//Instantiating a Workbook object (fichier de calcul = fichier excel)
		Workbook workbook = new Workbook();

		//Obtaining the reference of the newly added worksheet (feuille de cacul)
		int sheetIndex = workbook.getWorksheets().add();
		Worksheet sheet = workbook.getWorksheets().get(sheetIndex);
		Cells cells = sheet.getCells();

		//Setting the value to the cells
		Cell cell = cells.get("A1");
		cell.setValue("Credits");
		cell = cells.get("B1");
		cell.setValue("Couples");
		cell = cells.get("C1");
		cell.setValue("Amounts");

		cell = cells.get("A2");
		cell.setValue("Immo");
		cell = cells.get("A3");
		cell.setValue("Immo");
		cell = cells.get("A4");
		cell.setValue("Conso");
		cell = cells.get("A5");
		cell.setValue("Conso");
		cell = cells.get("A6");
		cell.setValue("Conso");
		cell = cells.get("A7");
		cell.setValue("Conso");
		cell = cells.get("A8");
		cell.setValue("Immo");
		cell = cells.get("A9");
		cell.setValue("Immo");
		cell = cells.get("A10");
		cell.setValue("Immo");
		cell = cells.get("A11");
		cell.setValue("Conso");
		cell = cells.get("A12");
		cell.setValue("Conso");
		cell = cells.get("A13");
		cell.setValue("Conso");
		cell = cells.get("A14");
		cell.setValue("Conso");
		cell = cells.get("A15");
		cell.setValue("Immo");

		cell = cells.get("B2");
		cell.setValue("Cple1");
		cell = cells.get("B3");
		cell.setValue("Cple2");
		cell = cells.get("B4");
		cell.setValue("Cple1");
		cell = cells.get("B5");
		cell.setValue("Cple2");
		cell = cells.get("B6");
		cell.setValue("Cple1");
		cell = cells.get("B7");
		cell.setValue("Cple2");
		cell = cells.get("B8");
		cell.setValue("Cple1");
		cell = cells.get("B9");
		cell.setValue("Cple1");
		cell = cells.get("B10");
		cell.setValue("Cple3");
		cell = cells.get("B11");
		cell.setValue("Cple1");
		cell = cells.get("B12");
		cell.setValue("Cple3");
		cell = cells.get("B13");
		cell.setValue("Cple3");
		cell = cells.get("B14");
		cell.setValue("Cple2");
		cell = cells.get("B15");
		cell.setValue("Cple3");

		cell = cells.get("C2");
		cell.setValue(500000);
		cell = cells.get("C3");
		cell.setValue(200000);
		cell = cells.get("C4");
		cell.setValue(6000);
		cell = cells.get("C5");
		cell.setValue(15000);
		cell = cells.get("C6");
		cell.setValue(40700);
		cell = cells.get("C7");
		cell.setValue(50000);
		cell = cells.get("C8");
		cell.setValue(643000);
		cell = cells.get("C9");
		cell.setValue(500000);
		cell = cells.get("C10");
		cell.setValue(200000);
		cell = cells.get("C11");
		cell.setValue(6000);
		cell = cells.get("C12");
		cell.setValue(15000);
		cell = cells.get("C13");
		cell.setValue(40700);
		cell = cells.get("C14");
		cell.setValue(50000);
		cell = cells.get("C15");
		cell.setValue(643000);

		PivotTableCollection pivotTables = sheet.getPivotTables();

		//Adding a PivotTable to the worksheet
		int index = pivotTables.add("=A1:C15", "F7", "PivotTable2");

		//Accessing the instance of the newly added PivotTable
		PivotTable pivotTable = pivotTables.get(index);

		//Unshowing grand totals for rows.
		pivotTable.setRowGrand(false);

		//Dragging the first field to the row area.
		pivotTable.addFieldToArea(PivotFieldType.ROW, 0);

		//Dragging the second field to the column area.
		pivotTable.addFieldToArea(PivotFieldType.COLUMN, 1);

		//Dragging the third field to the data area.
		pivotTable.addFieldToArea(PivotFieldType.DATA, 2);

		//Saving the Excel file
		workbook.save(dataDir + "Report1.xls");
		
		System.out.println("Workbook with chart is successfully created.");
	}
}
