package com.aspose.cells.examples.files.handling;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class OpeningTabDelimitedFiles {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(OpeningTabDelimitedFiles.class);
		String filePath = dataDir + "Book1.html";

		// Creating and TAB_DELIMITED LoadOptions object
		LoadOptions loadOptions5 = new LoadOptions(FileFormatType.TAB_DELIMITED);

		// Creating an Workbook object with Tab Delimited text file path and the
		// loadOptions object
		Workbook workbook7 = new Workbook(dataDir + "Book1TabDelimited.txt", loadOptions5);

		// Print message
		System.out.println("Tab Delimited workbook has been opened successfully.");
		// ExEnd:1

	}
}
