package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderJquery {
public static void main(String[] args) throws Throwable {
	//.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(0);
	WebElement ele= driver.findElement(By.xpath("//div[@id='slider']/span"));
	Actions act= new Actions(driver);
	act.dragAndDropBy(ele,100, 0).perform();
	
}
}
