package selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CrossBrowser 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter your browser");
		String x = sc.nextLine();
		if (x.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Harsha\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (x.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "c:\\Harsha\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		if (x.equalsIgnoreCase("opera")) 
		{

			System.setProperty("webdriver.opera.driver", "c:\\Harsha\\operadriver.exe");
			driver = new OperaDriver();
		}
	}

}
