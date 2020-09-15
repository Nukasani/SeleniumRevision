package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.xpath("//*[text()='Metro']"));
		if(e.isDisplayed())
		{
			System.out.println("element is present");
			
		}
		

	}

}
