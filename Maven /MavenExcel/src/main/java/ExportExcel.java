import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.*;


public class ExportExcel 
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream file = new FileInputStream("F:\\test.xls");
	     
	    //Get the workbook instance for XLS file 
	    HSSFWorkbook workbook = new HSSFWorkbook(file);
		 
		//Get first sheet from the workbook
		HSSFSheet sheet = workbook.getSheetAt(0);
		for(int i=0;i<10;i++)
		{
			HSSFRow row=sheet.createRow(i);
			//row.createCell(0);
			Cell cell=row.createCell(i);
			cell.setCellValue("Thomson");
		}
		
		FileOutputStream out = new FileOutputStream("F:\\Test.xls");
		workbook.write(out);
		out.close();
		workbook.close();
	}
}
