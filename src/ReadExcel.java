import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\MD ZONAED BHUIYAN\\eclipse-workspace\\ReadExcelData\\data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = (XSSFSheet) wb.getSheetAt(0);
		
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data0);
		
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is "+data1);
		
		String data2=sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is "+data2);
		
		wb.close();
		
		
		
		
	}

}
