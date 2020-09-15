package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBowser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","c:\\Harsha\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		

	}

}
