package excelfiles;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class HssfWorkbook 
{
	public static void main(String[] args) throws Exception
	{
		Workbook wb=new HSSFWorkbook();
		//sheet creation
		wb.createSheet("Nukasani");

		//file creation
		File f=new File("excelfile1.xls");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
	

	}

}
