package excelfiles;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SendingMultipledataintoexcelfile 
{

	public static void main(String[] args) throws Exception
	{
		Workbook wb = new XSSFWorkbook();
		Sheet sh = wb.createSheet("java1");
		Object[][] databook = {
				{ "Name", "Gender", "Age" }, 
				{ "harsha", "male", "25" }, 
				{ "sudha", "female", "50" },
				{ "balaji", "male", "60" },
				{ "sahithi", "female", "22" }
								};
		int rowcount = 0;
		for (Object[] data1 : databook) 
		{
			Row r = sh.createRow(rowcount++);
			int colcount = 0;
			for (Object field : data1) 
			{
				Cell c = r.createCell(colcount++);
				if (field instanceof String) 
				{
					c.setCellValue((String) field);
				} 
				else if (field instanceof Integer) 
				{
					c.setCellValue((Integer) field);
				}

			}
		}
		File f=new File("javafile.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
	}

}
