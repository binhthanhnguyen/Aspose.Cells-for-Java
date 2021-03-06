package com.aspose.cells.examples.charts.InsertingControlsintoCharts;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

import java.io.FileInputStream;

public class AddingPictureToChart {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingPictureToChart.class);

		String filePath = dataDir + "chart.xls";

		FileInputStream stream = new FileInputStream(dataDir + "logo.jpg");

		Workbook workbook = new Workbook(filePath);

		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Load the chart from source worksheet
		Chart chart = worksheet.getCharts().get(0);

		Picture pic = chart.getShapes().addPictureInChart(50, 50, stream, 40, 40);
		MsoLineFormat lineformat = pic.getLineFormat();

		lineformat.setForeColor(Color.getBlue());
		lineformat.setDashStyle(MsoLineDashStyle.DASH_DOT_DOT);
		// Output the file
		workbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Picture added to chart successfully.");
		// ExEnd:1
	}
}
