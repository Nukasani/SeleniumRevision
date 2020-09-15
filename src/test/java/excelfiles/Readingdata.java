package excelfiles;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingdata 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("G:\\family.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fi);
		
		//go to sheet1
		Sheet sh=wb.getSheet("sheet1");
		int rows=sh.getPhysicalNumberOfRows();
		int cols=sh.getRow(0).getLastCellNum();
		
		//get data from sheet1
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			sh.getRow(i).getCell(j).setCellType(CellType.STRING);
			String x=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.println(" "+x);
			}
			
		}
		System.out.println();
		
		
		

	}

}
