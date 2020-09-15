package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static void main(String[] args) throws Exception
	{
	//Extent reports
	ExtentReports er=new ExtentReports("E:\\harsha.html",false);
	ExtentTest et=er.startTest("gmail test");
	WebDriver driver;
	//launch
	System.setProperty("webdriver.chrome.driver","c:\\Harsha\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//wait
	WebDriverWait w=new WebDriverWait(driver,10);
	w.until(ExpectedConditions.elementToBeClickable(By.name("q")));
	String x=driver.getTitle();
	System.out.println(x);
	//condition
	if(x.contains("Google"))
	{
		et.log(LogStatus.PASS,"gmail title test passed");
		System.out.println("if block");
	}
	else
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
		String fname=sf.format(d)+".png";
		File src= ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(fname);
		FileHandler.copy(src,dest);
		et.log(LogStatus.FAIL,et.addScreenCapture(fname)+"google title test failed");
		System.out.println("else block");
		
	}
	//close site
	driver.close();
	//save and close reports file
	er.endTest(et);
	er.flush();
	

	}

}
