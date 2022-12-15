package webdriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

//Test Data or Input Data
//DT    Var         VV
static String  url     = "http://183.82.103.245/nareshit/login.php";
static String username = "nareshit";
static String password = "nareshit";
static String title1   = "OrangeHRM - New Level of HR Management";
static String title2   = "OrangeHRM";
public static void main(String args[]) throws Exception{
    //Test Steps
System.setProperty("webdriver.gecko.driver","F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to(url);
//Verify page Title
//Actual Result            ExpectedResult
if(driver.getTitle().equals(title1)) {
System.out.println("Title matched");    
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
//                                          HardCoded--TestData
//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

//[OR] - Using Variable
driver.findElement(By.name("txtUserName")).sendKeys(username);
driver.findElement(By.name("txtPassword")).sendKeys(password);
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
//Verify page title
if(driver.getTitle().equals(title2)) {
System.out.println("Title matched");
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
//Mouseover
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("Mouseover completed");
Thread.sleep(4000);
//click on AddEmp submenu
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(4000);
System.out.println("Clicked on Submenu");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("logout completed");
driver.close();



		

	}

}
