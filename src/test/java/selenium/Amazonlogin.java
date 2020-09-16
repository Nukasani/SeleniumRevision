package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sriharshanukasani@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Harsha@5304");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//*[@name='field-keywords']")).sendKeys("iphone xr white");
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Apple iPhone 11 (64GB) - White'])[1]")).click();
		Thread.sleep(2000);
		Set<String> x=driver.getWindowHandles();
		ArrayList<String> y=new ArrayList<String>(x);
		driver.switchTo().window(y.get(1));
		String z=driver.findElement(By.xpath("//*[@id='priceblock_dealprice']")).getText();
		String z1=z.replaceAll("[^1-9]", " ");
		String z2=z1.replace(" ","");
		System.out.println(z+"  "+z1+" "+z2);
			
	}
}
