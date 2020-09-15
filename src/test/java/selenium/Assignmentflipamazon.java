package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentflipamazon 
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
		int ama=Integer.parseInt(z2);
		System.setProperty("webdriver.chrome.driver","C:\\Harsha\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9603634253");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("harsha@5304");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 11 white");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Apple iPhone 11 (White, 64 GB)']")).click();
		Set<String> x1=driver.getWindowHandles();
		ArrayList<String> y1=new ArrayList<String>(x1);
		driver.switchTo().window(y1.get(1));
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//*[@class='_1vC4OE _3qQ9m1']")).getText();
		String b=a.replaceAll("[^0-9]","");
		int flip=Integer.parseInt(b);
		System.out.println("flipkart price is   "+flip+"    amazon price is  "+ama);
		if(ama<flip)
		{
			System.out.println("Lowest price is   "+ama);
		}
		else
		{
			System.out.println("Lowest is  "+flip);
		}
		driver.close();
		
	

	}

}
