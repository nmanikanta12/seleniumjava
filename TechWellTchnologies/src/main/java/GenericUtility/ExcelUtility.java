package GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelUtility 
{
	private static final String SheetName = null;

	@DataProvider(name="testdata")
	public <object> Object[][] Reading(String filepath,String sheetname ) throws  EncryptedDocumentException, InvalidFormatException, IOException
	{
		File excel=new File(filepath);
		Workbook workbook = WorkbookFactory.create(excel);
		Sheet sheet = workbook.getSheet(SheetName); 
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount][cellCount];
		for(int row=0;row<rowCount;row++) {
			Row actualrow = sheet.getRow(row);
			for(int cell=0;cell<actualrow.getLastCellNum();cell++) {
				data[row][cell]=actualrow.getCell(cell).toString();
			}	
			return data;  
		}



  

	}
