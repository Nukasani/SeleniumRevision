package selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Html 
{
	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com");
		String x=driver.getTitle();
		System.out.println(x);
		driver.quit();

	}

}
