package excelfiles;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xssf 
{

	public static void main(String[] args) throws Exception
	{
		XSSFWorkbook wb=new XSSFWorkbook();
		wb.createSheet("xssfsheet");
		//file creation
		File f=new File("Excelsheet2.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
				
		

	}

}
