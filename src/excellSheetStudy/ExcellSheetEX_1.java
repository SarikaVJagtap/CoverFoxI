package excellSheetStudy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEX_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
{
		FileInputStream myFile = new FileInputStream("F:\\29 july Excell sheet\\Book1.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(value);
		System.out.println("=================================");

		double value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		
		System.out.println(value2);
		
		
		
		
		
		
		
		
		
	}

}
