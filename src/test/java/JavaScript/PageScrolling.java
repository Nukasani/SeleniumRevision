package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Window;

public class PageScrolling 
{

	public static void main(String[] args) throws Exception
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		WebElement e=driver.findElement(By.xpath("//*[text()='LEARN MORE']"));
		
		js.executeScript("arguments[0].scrollIntoView();",e);
		
	}

}
