package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAnElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement e=driver.findElement(By.xpath("(//*[@name='btnI'])[2]"));
		//e.click();
		
		//     or
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",e);
		
	}

}
