package programs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browsing {
	@Parameters ("browsername")
	@Test
	public void TC1(String browsername) {
		WebDriver driver=null;
		if (browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Sai\\\\\\\\Downloads\\\\\\\\SELENIUM TOOLS\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.selenium.dev/");
		}if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Users\\\\\\\\Sai\\\\\\\\Downloads\\\\\\\\geckodriver-v0.32.0-win32\\\\\\\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    driver.get("https://kite.zerodha.com/");
			}
		
	   //  driver.get("https://kite.zerodha.com/");

}
}