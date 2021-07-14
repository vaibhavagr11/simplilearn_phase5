package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("identifierId")).sendKeys("vaibhavagr11@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		String at =driver.getTitle();
		System.out.println("driver title:" + at);
		String st="gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(st)) {
			System.out.println("Test Successful");
			
		}
		else {
			System.out.println("Test Unsiccessful");
		}
		
	}

}
