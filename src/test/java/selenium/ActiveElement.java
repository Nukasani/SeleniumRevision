package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ActiveElement 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.switchTo().activeElement().sendKeys("royal enfiled");
		File src=driver.switchTo().activeElement().getScreenshotAs(OutputType.FILE);
		File dest=new File("active.png");
		FileHandler.copy(src,dest);

	}

}
