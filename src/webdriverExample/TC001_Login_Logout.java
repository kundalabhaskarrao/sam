package webdriverExample;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC001_Login_Logout {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Data\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");

	}

}
     

