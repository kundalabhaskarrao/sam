package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdrivergecko.driver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("file://E:\\Selenium Data\\html\\WebTable.html");
//Count
int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
int col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td")).size();
int row_col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();

System.out.println("RowCount"+row);
System.out.println("ColCount"+col);
System.out.println("Row_ColCount"+row_col);
//Data--cell
String celldata = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
System.out.println(celldata);
//Data--Table
//DT Var VV
for(int i=1;i<=row;i++) {
	String data = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
	
	System.out.println(data);
	Thread.sleep(3000);
	//System.out.println(i);
	
	
}
driver.close();
	}

}
