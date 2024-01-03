package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandle {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement ele = driver.findElement(By.xpath("//h4[text()='TOP  PICKS']"));
	jse.executeScript("arguments[0].scrollIntoView();" , ele);
}
}
