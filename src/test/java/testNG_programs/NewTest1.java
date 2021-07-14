package testNG_programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		//driver.manage().window().maximize();
		
		int totalFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames: " + totalFrames);
		//Thread.sleep(3000);
		
		WebElement frame1= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		//Thread.sleep(3000);
		WebElement frame1Body= driver.findElement(By.tagName("body"));
		
		String frame1Text=frame1Body.getText();
		
		System.out.println("frame1 : "+ frame1Text);
		
		int count=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("no. of frames in frame1 : "+ count);
		
		//Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement frame2Body= driver.findElement(By.tagName("body"));
		
		String frame2Text=frame2Body.getText();
		
		System.out.println("frame1 : "+ frame2Text);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting on chrome browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Finished on chrome browser");
	  driver.close();
  }

}
