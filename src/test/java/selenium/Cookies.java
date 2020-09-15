package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Set<Cookie> c=driver.manage().getCookies();
		for(Cookie l:c)
		{
			System.out.println(l);
		}
		

	}

	
		
	}


