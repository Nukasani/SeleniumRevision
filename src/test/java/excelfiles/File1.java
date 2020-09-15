package excelfiles;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File1 
{
	public static void main(String[] args) throws Exception
	{
		//create a new xlsx file
		//create a new sheet
		//enter balaji in first row,first column
		
		XSSFWorkbook wb=new XSSFWorkbook();
		//sheet creation
		Sheet sh=wb.createSheet("sh1");
		
		//set column width
		sh.setColumnWidth(0,3500);
		
		//row creation
		Row r=sh.createRow(0);
		
		//create cell
		Cell c=r.createCell(0);
		c.setCellValue("Dr N.BAlaji");
		
		//file creation
		File f=new File("Excel3.xlsx");
		FileOutputStream fo =new FileOutputStream(f);
		
		wb.write(fo);
		wb.close();
		fo.close();
		
		

	}

}
