package poc.aspose.cells.TechnicalArticles;

import com.aspose.cells.MetadataOptions;
import com.aspose.cells.MetadataType;
import com.aspose.cells.Workbook;
import com.aspose.cells.WorkbookMetadata;
import poc.aspose.cells.Utils;

public class UsingWorkbookMetadata {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UsingWorkbookMetadata.class) + "TechnicalArticles/";

		// Open Workbook metadata
		MetadataOptions options = new MetadataOptions(MetadataType.DOCUMENT_PROPERTIES);
		WorkbookMetadata meta = new WorkbookMetadata(dataDir + "Sample1.xlsx", options);

		// Set some properties
		meta.getCustomDocumentProperties().add("test", "test");

		// Save the metadata info
		meta.save(dataDir + "UsingWorkbookMetadata_out.xlsx");

		// Open the workbook
		Workbook w = new Workbook(dataDir + "UsingWorkbookMetadata_out.xlsx");

		// Read document property
		System.out.println(w.getCustomDocumentProperties().get("test"));

	}
}
