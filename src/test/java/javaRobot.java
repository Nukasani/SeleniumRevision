import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import com.sun.glass.events.KeyEvent;

public class javaRobot 
{

	public static void main(String[] args) throws Exception
	{
		//launch calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		//send value to clip board
		StringSelection x=new StringSelection("10");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		
		//paste in calculator
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		//click + 
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
		//send value to clip board
		StringSelection y=new StringSelection("20");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
		
		//paste in calculator
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		
		//click =
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		
		
		
		
		
	}

}
