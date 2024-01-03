package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimePopup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.id("name")).sendKeys("java");
	driver.findElement(By.cssSelector("input[type='button']")).click();
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	Thread.sleep(3000);
	//alt.dismiss();
	String data=alt.getText();
	System.out.println(data);
	
}
}
