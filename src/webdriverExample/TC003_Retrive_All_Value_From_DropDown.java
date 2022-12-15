package webdriverExample;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


 
public class TC003_Retrive_All_Value_From_DropDown {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		/*
          Test Steps--
          1.Open Application\
          2.Login into Application
          3.Retrieve all the value from SearchBy DropDown
          4.Click on Logout
          5.Close Application
          */
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Data\\Drivers.exe");
		//WebDriverManager.firefoxdriver().setup();
		System.out.println("Open Allication");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	
	System.out.println("log in completed");
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(By.name("loc_code")));
	List<WebElement> DDvalue=st.getOptions();
	for(WebElement temp:DDvalue) {
		System.out.println(temp.getText());
	}
driver.switchTo().defaultContent();	//exit frame
driver.findElement(By.linkText("Logout")).click();
	driver.close();
	}
	
	}
	


