package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.xpath("(//*[text()='One Way'])[1]"));
		if(e.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		if(e.isEnabled())
		{
			System.out.println("element is enabled");
			
		}
		else
		{
			System.out.println("not enabled");
		}
		

	}

}
