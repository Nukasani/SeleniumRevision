package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofactivebrowserwindow 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("pagescreenshot.png");
		FileHandler.copy(src,dest);
	}

}
