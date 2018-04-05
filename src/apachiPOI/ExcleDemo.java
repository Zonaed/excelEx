package apachiPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcleDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheetAt(0);
		Row rw=sheet.getRow(2);
		Cell cl=rw.getCell(2);
		String value=cl.getStringCellValue();
		System.out.println(value);

	}

}









//thats all for git 



