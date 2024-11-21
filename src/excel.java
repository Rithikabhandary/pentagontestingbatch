import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream(".\\Textdata\\patch.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		
		String value=workbook.getSheet("Batch").getRow(0).getCell(0).getStringCellValue();
		System.out.println (value);

	}

}
