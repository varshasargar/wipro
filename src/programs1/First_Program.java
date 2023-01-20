package programs1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Program {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Sai\\\\Downloads\\\\SELENIUM TOOLS\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//opent the app
		driver.get("https://www.amazon.com/");
		//create object of Robot class
	  Robot r=new Robot();
	  //keypress
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	  Thread.sleep(4000);
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	  
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	  
	  Thread.sleep(4000);
	  r.keyPress(KeyEvent.VK_PAGE_DOWN);
	  //keyrelease
	  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}


	
	}


