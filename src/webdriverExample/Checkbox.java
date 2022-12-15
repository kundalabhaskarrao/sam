package webdriverExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkbox {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//Test Steps
		System.setProperty("webdriver.geckodriver","E:\\Selenium Data\\Drivers\\geckoDrive.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(4000); //wait stmt
	//Enter into frame
	driver.switchTo().frame("rightMenu");
	//click on checkbox
	//DT Var VV
	for(int i=1; i<=10;i=i+2) {
driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
System.out.println("clicked on checkbox of "+i);
Thread.sleep(3000);
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	}
	}
	


