package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("No, thanks")).click();
		driver.findElement(By.xpath("//div[@data-visualcompletion='data-visualcompletion']")).click();
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.name("theme")));
		s.selectByVisibleText("Honeymoon");
		

	}

}
