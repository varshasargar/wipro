package programs1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_Ele {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Downloads\\SELENIUM TOOLS\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement sc = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		File src = sc.getScreenshotAs(OutputType.FILE);
		File desk =new File("C:\\Users\\Sai\\Desktop\\screenshot\\FacebookP.png");
		Files.copy(src, desk);
		
	}

}
