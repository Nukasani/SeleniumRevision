package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin 
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11 white");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Apple iPhone 11 (White, 128 GB)']")).click();
		Set<String> x1=driver.getWindowHandles();
		ArrayList<String> y1=new ArrayList<String>(x1);
		driver.switchTo().window(y1.get(1));
		String a=driver.findElement(By.xpath("//*[text()='₹71,600']")).getText();
		String b=a.replaceAll("[^0-9]","");
		
		
	
		
		

	}

}
