package Section2;

import java.awt.SecondaryLoop;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameout {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Frames']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='Alert']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);	
	String data= driver.findElement(By.cssSelector("h2[title='Interface Alert']")).getText();
	System.out.println(data);
	
}
}
