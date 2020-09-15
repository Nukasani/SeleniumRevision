package excelfiles;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingdatafromspecific 
{

	public static void main(String[] args) throws Exception
	{
		//reading data from specific row
		File f=new File("G:\\excel5.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("sheet1");
		Row r=sh.getRow(2);
		Cell c=r.getCell(2);
		System.out.println(c);

	}

}
