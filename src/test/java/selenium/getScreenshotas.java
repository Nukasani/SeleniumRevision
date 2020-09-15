package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class getScreenshotas 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		File src=driver.findElement(By.xpath("//*[@name='q']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("Screenshot1.png");
		FileHandler.copy(src, dest);
		driver.close();
		

	}

}
