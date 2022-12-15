package webdriverExample;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class TC_TestData {
	static String url =("http://183.82.103.245/nareshit/login.php");
	 static String username ="nareshit";
	 static String password ="nareshit";
	 static String title1 = "OrangeHRM- New Level of HR Management";
	 static String title2 = "OrangeHRM";
	 

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Test Steps
  System.setProperty("webdriver.geckodriver","E:\\Selenium Data\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
  driver.navigate().to(url);
  //Verify page Title
  //Actual Result  ExpectedResult
  if(driver.getTitle().equals(title1)) {
	  System.out.println("Title  matched");
  }
  else {
	  System.out.println("Title not matched");
	  System.out.println(driver.getTitle());
  }
//HardCoded--TestData
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
if(driver.getTitle().equals("title2")) {
System.out.println("Title matched");
}
else {
System.out.println("Title not matched");
System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("logout completed");
driver.close();
}




  }
  
  
  
	
	


