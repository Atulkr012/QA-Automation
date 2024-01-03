package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemoQa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/nestedframes");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(ele).switchTo().frame(0);
	String data =driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(data);
			
}
}
