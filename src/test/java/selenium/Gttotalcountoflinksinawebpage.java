package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gttotalcountoflinksinawebpage 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("(//a)|(//link)|(//href)"));
		int links=0;
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).isDisplayed())
			{
				links=links+1;
			}
		}
			System.out.println(l.size());
			System.out.println(links);
	}

}
