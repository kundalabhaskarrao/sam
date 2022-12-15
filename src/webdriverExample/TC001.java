package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC001 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Data\\Drivers\\chromedriver.exe ");
			
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		Thread.sleep(3000);
		System.out.println("Application opened");
		driver.findElement(By.name("username")).sendKeys("bhaskar1");
		driver.findElement(By.name("password")).sendKeys("9938520628");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		driver.findElement(By.name("Logout")).click();
		Thread.sleep(3000);
		System.out.println("logout completed");
		
		driver.close();
		

	}

}
