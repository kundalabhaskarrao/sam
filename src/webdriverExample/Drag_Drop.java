package webdriverExample;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Test Steps
		System.setProperty("webdriver.geckodriver","E:\\Selenium Data\\Drivers\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable");
		Thread.sleep(3000);
		//Verify Title - stop exe - cond: failed
   assertEquals(driver.getTitle(),"Droppable | jQuery UI");//inspect take to head
   System.out.println("Title matched");
   driver.switchTo().frame(0);
   Actions ac=new Actions(driver);
   ac.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();

   System.out.println("Drag&Drop");
   Thread.sleep(5000);
   driver.switchTo().defaultContent();
   driver.close();
	}

}
