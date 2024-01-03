package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterLogin {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement ele = driver.findElement(By.id("username"));
	ele.sendKeys("admin");
	WebElement ele1 = driver.findElement(By.name("pwd"));
	ele1.sendKeys("manager");
	WebElement ele2 = driver.findElement(By.id("keepLoggedInCheckBox"));
	ele2.click();
	WebElement ele3 = driver.findElement(By.id("loginButton"));
	ele3.click();
}
}