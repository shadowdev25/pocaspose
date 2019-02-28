package poc.aspose.cells.TechnicalArticles;

import poc.aspose.cells.Utils;

//ExStart:FilePathProvider

public class FilePathProvider {
	// Gets the full path of the file by worksheet name when exporting worksheet to html separately.
	// So the references among the worksheets could be exported correctly.
	public String getFullName(String sheetName) {

		String dataDir = Utils.getSharedDataDir(FilePathProvider.class) + "TechnicalArticles/";
		if ("Sheet2".equals(sheetName)) {
			return dataDir + "Sheet2.html";
		} else if ("Sheet3".equals(sheetName)) {
			return dataDir + "Sheet3.html";
		}

		return "";
	}
}

