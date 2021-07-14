package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("watches");
		driver.findElement(By.xpath("//option[@value='293']")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.partialLinkText("Sony")).click();
		
		
		

	}

}
