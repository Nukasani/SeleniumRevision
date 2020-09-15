package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		int x=driver.manage().window().getPosition().getX();
		System.out.println(x);
		driver.manage().window().maximize();
		int y=driver.manage().window().getPosition().getX();
		System.out.println(y);
		
		


	}

}
