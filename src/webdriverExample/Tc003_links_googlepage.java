package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Tc003_links_googlepage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
		
 WebDriver driver=new FirefoxDriver();	
 driver.navigate().to("https://www.google.com/");
 System.out.println("application opened");
 List<WebElement>gglink=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
 for(WebElement link:gglink) {
	 System.out.println(link.getText());
 }
 driver.close();
}}
