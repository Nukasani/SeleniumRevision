package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementstextboxesinawebpage 
{

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9603634253");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("harsha@5304");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		List<WebElement> l=driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println(l.size());

	}

}
