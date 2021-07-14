package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vaibhav");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Agrawal");
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(5000);
		
		WebElement testDropDown = driver.findElement(By.id("Skills")); 
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByIndex(5);  
		
		WebElement testDropDown2 = driver.findElement(By.id("countries")); 
		Select dropdown2 = new Select(testDropDown2);  
		dropdown2.selectByValue("India"); 
		Thread.sleep(5000);
		
		
		WebElement testDropDown4 = driver.findElement(By.id("yearbox")); 
		Select dropdown4 = new Select(testDropDown4);  
		dropdown4.selectByValue("1999");
		Thread.sleep(5000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("password");
		driver.findElement(By.id("secondpassword")).sendKeys("password");
		

	}

}
