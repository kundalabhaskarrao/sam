package webdriverExample;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;

public class TC_Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdrive.geckodriver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("http://183.82.103.245//nareshit//login.php");
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
Alert a = driver.switchTo().alert();
System.out.println("a.getText()");
a.accept();
Thread.sleep(4000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.close();









}

}
