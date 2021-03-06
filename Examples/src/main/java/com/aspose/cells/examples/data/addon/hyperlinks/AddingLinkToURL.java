package com.aspose.cells.examples.data.addon.hyperlinks;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class AddingLinkToURL {

	public static void main(String[] args) throws Exception {
		// ExStart:AddingLinkToURL
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingLinkToURL.class);

		// Instantiating a Workbook object
		Workbook workbook = new Workbook();

		// Obtaining the reference of the first worksheet.
		WorksheetCollection worksheets = workbook.getWorksheets();
		Worksheet sheet = worksheets.get(0);
		HyperlinkCollection hyperlinks = sheet.getHyperlinks();

		// Adding a hyperlink to a URL at "A1" cell
		hyperlinks.add("A1", 1, 1, "http://www.aspose.com");

		// Saving the Excel file
		workbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Process completed successfully");
		// ExEnd:AddingLinkToURL
	}
}
