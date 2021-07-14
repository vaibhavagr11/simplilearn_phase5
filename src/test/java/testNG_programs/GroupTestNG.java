package testNG_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestNG {
	WebDriver driver;
	String title="ToolsQA-Demo website for automation";
	
  @Test(groups= {"demo"},priority = 1)
  public void starting_point() {
	  System.out.println("This is starting point of the test");
	  System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/");
  }
  @Test(groups= {"demo"},priority = 2)
  public void checkTitle() {
	  String testTitle="ToolsQA";
	  String originalTitle=driver.getTitle();
	  Assert.assertEquals(originalTitle, testTitle);
	  
  }
  
  @Test(groups= {"demo"},priority = 3)
  public void e_checkTitle() {
	  System.out.println("Inside second function");
		 driver.close();
	  
  }
}
