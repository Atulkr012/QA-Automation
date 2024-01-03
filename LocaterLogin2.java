package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterLogin2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webDriver.Chrome.Driver" ,"D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.name("username"));
	ele.sendKeys("Admin");
	WebElement ele1 =driver.findElement(By.name("password"));
	ele1.sendKeys("admin123");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
