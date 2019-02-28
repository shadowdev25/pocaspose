package poc.aspose.cells.TechnicalArticles;

import java.util.Iterator;

import com.aspose.cells.Column;
import com.aspose.cells.Workbook;
import poc.aspose.cells.Utils;

public class ColumnsIterator {
	public static void main(String[] args) throws Exception {

		String dataDir = Utils.getSharedDataDir(ColumnsIterator.class) + "TechnicalArticles/";
		// Load a file in an instance of Workbook
		Workbook book = new Workbook(dataDir + "sample.xlsx");

		// Get the iterator for ColumnsCollection
		Iterator colsIterator = book.getWorksheets().get(0).getCells().getColumns().iterator();
		// Traverse columns in the collection
		while (colsIterator.hasNext()) {
			Column col = (Column) colsIterator.next();
			System.out.println(col.getIndex());
		}

	}
}
