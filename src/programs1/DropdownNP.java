package programs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
;

public class DropdownNP {
	public static void main(String[] args) throws Throwable     {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Downloads\\SELENIUM TOOLS\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s=new Select(day);
		s.selectByVisibleText("7");
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Mar");
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1999");
		}

}
