package webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadingExcelvalues {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell);
		//System.out.println(sheet.getRow(1).getCell(1));
	}
}
