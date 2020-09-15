package selenium;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOperadriver 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver","c:\\Harsha\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
	

	}

}
