package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC_verify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","E:\\Selenium Data\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
if(driver.getTitle().equals("OrangeHRM-New Level of HR Management")) {
	System.out.println("Title matched");
	
}
else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	
}
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
if(driver.getTitle().equals("OrangeHRM")) {
	System.out.println("Title matched");
	
}
else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();
}

	}


