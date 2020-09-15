package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("sreekaanth677");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']/following::*[1]")).click();
	}

}
