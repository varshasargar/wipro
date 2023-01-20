package programs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sai\\\\Downloads\\\\SELENIUM TOOLS\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=h8CVV_WOGpLT8ge775KwDQ");
		WebElement target = driver.findElement(By.xpath("//a[@class=\"gb_d\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(target).click().perform();
		Thread.sleep(3000);
		WebElement target1 = driver.findElement(By.xpath("//a[@class=\"gb_j\"]"));
		a.click(target1).perform();

	}

}
