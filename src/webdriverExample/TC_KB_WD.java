package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TC_KB_WD {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		//Test Steps
		System.setProperty("webdriver.geckodriver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.navigate().to("https://www.google.com");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
Thread.sleep(4000);
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
Thread.sleep(4000);
driver.close();

	}

}
