package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.Color;
import com.aspose.cells.Style;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ModifyExistingStyle {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ModifyExistingStyle.class) + "TechnicalArticles/";

		/*
		 * Create a workbook. Open a template file. In the book1.xls file, we have applied Microsoft Excel's Named style
		 * i.e., "Percent" to the range "A1:C8".
		 */
		Workbook workbook = new Workbook(dataDir + "book1.xlsx");

		// We get the Percent style and create a style object.
		Style style = workbook.getNamedStyle("Percent");

		// Change the number format to "0.00%".
		style.setNumber(10);

		// Set the font color.
		style.getFont().setColor(Color.getRed());

		// Update the style. so, the style of range "A1:C8" will be changed too.
		style.update();

		// Save the excel file.
		workbook.save(dataDir + "ModifyExistingStyle_out.xlsx");

	}
}
