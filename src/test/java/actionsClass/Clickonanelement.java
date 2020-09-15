package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickonanelement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
		
						// or
		WebElement e=driver.findElement(By.xpath("(//*[@type='submit'])[4]"));
		Actions a=new Actions(driver);
		a.click(e).perform();
		
	}

}
