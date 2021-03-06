package com.aspose.cells.examples.files.handling;

import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

import java.io.FileInputStream;

public class OpeningFilesThroughPath {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(OpeningFilesThroughPath.class);

		// Opening from path.
		// Creating an Workbook object with an Excel file path
		Workbook workbook1 = new Workbook(dataDir + "Book1.xlsx");

		// Print message
		System.out.println("Workbook opened using path successfully.");
		// ExEnd:1

	}
}
