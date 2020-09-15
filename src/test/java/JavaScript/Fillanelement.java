package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillanelement 
{
	public static void main(String[] args) 
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement e=driver.findElement(By.name("q"));
		//e.sendKeys("harsha");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='harsha'",e);
		

	}

}
