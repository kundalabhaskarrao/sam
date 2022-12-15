package webdriverExample;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Exception {
		
FileInputStream fileinput = new FileInputStream("E:\\Selenium Data\\ExcelData\\TestData.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
XSSFSheet sheet = workbook.getSheet("Sheet1");
System.out.println(sheet.getSheetName());
System.out.println(sheet.getLastRowNum());

System.out.println("before updating Cell data"+ sheet.getRow(2).getCell(1));
//Write the data to excel file
XSSFCell cell=sheet.getRow(2).getCell(1);
cell.setCellValue(" bhaskar ");
fileinput.close();

FileOutputStream fileOut=new FileOutputStream("E:\\Selenium Data\\ExcelData\\TestData.xlsx");
workbook.write(fileOut);
System.out.println("Updated data after write is done"+ cell.getStringCellValue());
fileOut.close();
	}

}
