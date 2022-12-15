package webdriverExample;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;


public class TC_Verify1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/index.php");

if(driver.getTitle().equals("OrangeHRM - New Level of HRManagement")) {
	System.out.println("Title matched");
}
else {
	
	System.out.println("Title not matched");
	System.out.println("driver.getTitel()");
}
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
if(driver.getTitle().equals("OrangeHRM")) {
	System.out.println("Title matched");
	
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());

}
driver.findElement(By.linkText("Login")).click();
Thread.sleep(3000);
System.out.println("logout completed");
driver.close();

}
	}


