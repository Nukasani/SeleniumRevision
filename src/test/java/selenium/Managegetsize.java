package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managegetsize 
{
	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		driver.manage().window().maximize();
		int h1=driver.manage().window().getSize().getHeight();
		int w1=driver.manage().window().getSize().getWidth();
		System.out.println(h+" "+w);
		System.out.println(h1+" "+w1);
		
		driver.close();
		

	}

}
