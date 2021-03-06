package com.aspose.cells.examples.data.addon.namedranges;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class CreateNamedRangeofCells {

	public static void main(String[] args) throws Exception {
		// ExStart:CreateNamedRangeofCells
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CreateNamedRangeofCells.class);

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		WorksheetCollection worksheets = workbook.getWorksheets();

		// Accessing the first worksheet in the Excel file
		Worksheet sheet = worksheets.get(0);
		Cells cells = sheet.getCells();

		// Creating a named range
		Range namedRange = cells.createRange("B4", "G14");
		namedRange.setName("TestRange");

		// Saving the modified Excel file in default (that is Excel 2000) format
		workbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Process completed successfully");
		// ExEnd:CreateNamedRangeofCells
	}
}
