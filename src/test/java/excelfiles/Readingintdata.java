package excelfiles;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingintdata 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("G:\\number1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("sheet1");
		int r=sh.getPhysicalNumberOfRows();
		int c=sh.getRow(0).getLastCellNum();
		System.out.println("no of used rows is   "+r);
		System.out.println("no of used colums is   "+c);
		
		//creating results column
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy-hh-mm-ss");
		Date d=new Date();
		Cell ch=sh.getRow(0).createCell(r);
		ch.setCellValue(sf.format(d));
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				int x=(int) sh.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(x+" ");
				
			}
			System.out.println();
		}

	}

}
