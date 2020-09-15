package excelfiles;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingdatafromSendingMultipledataintoexcelfile
{

	public static void main(String[] args) throws Exception
	{
	//which file i am going t read is combination of integer&string
		File f=new File("javafile.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("java1");
		int x=sh.getPhysicalNumberOfRows();
		int y=sh.getRow(0).getLastCellNum();
		
		System.out.println("no.of used rows  "+x+":   no of used colums "+y);
		
		
		for(int i=1;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				
				String x1= sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print("  "+x1);
			}
			System.out.println();
			
		}
		

	}

}
