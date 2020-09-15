package excelfiles;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row5col2 {

	public static void main(String[] args) throws Exception {
		// creating .xlsx file with 5 rows and 2 columns

		Workbook wb = new XSSFWorkbook();
		Sheet sh = wb.createSheet();
		Row r = sh.createRow(5);
		Cell c = r.createCell(2);
		c.setCellValue("harsha");

		File f = new File("Excel4.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();

	}

}
