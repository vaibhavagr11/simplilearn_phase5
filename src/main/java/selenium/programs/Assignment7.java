package selenium.programs;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/vaibhavagrawal/Documents/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		Thread.sleep(1000);
		
		String MainWindow = driver.getWindowHandle();
		System.out.println("Current Window Handle: "+MainWindow);
		
		Thread.sleep(1000);
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			System.out.println("Current Child Window handle: "+ChildWindow);
			Thread.sleep(1000);
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				Thread.sleep(1000);
				driver.findElement(By.name("emailid")).sendKeys("test@email.com");
				Thread.sleep(1000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(1000);
				
				driver.close();
			}
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(MainWindow);
		driver.close();
		
				
		
		
		
		

	}

}
