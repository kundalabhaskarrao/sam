package webdriverExample;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;


public class Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileInputStream file = new FileInputStream("E:\\ExcelData\\TestData.xls");	
  Workbook wb=Workbook.getWorkbook(file);
  Sheet st=wb.getSheet("Sheet1");
  int row=1;
  String id=st.getCell(0,row).getContents();
  String name=st.getCell(1,row).getContents();
  String rollno=st.getCell(2,row).getContents();
  String subject=st.getCell(3,row).getContents();
  String email=st.getCell(4,row).getContents();
  System.out.println(id);
  System.out.println(name);
  System.out.println(rollno);
  System.out.println(subject);
  System.out.println(email);
  
	}

}
