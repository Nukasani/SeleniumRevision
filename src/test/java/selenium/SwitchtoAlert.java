package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoAlert
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Try it Yourself »'])[1]")).click();
		

	}

}
