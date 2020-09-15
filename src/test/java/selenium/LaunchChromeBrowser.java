package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//*[@name='q']"));
		e.sendKeys("harsha");
		Thread.sleep(2000);
		e.click();
		
		//driver.close();
		

	}

}
