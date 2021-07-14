package selenium.programs;

import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {
	
	public static void main(String[] args)  throws ParseException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebElement Table = driver.findElement(By.tagName("table"));
		
		WebElement row= Table.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]"));
		String text= row.getText();
		System.out.println(text);
		
		
		
	}

}
