package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassApproach {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/selenium/newtours/register.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Select s = new Select (driver.findElement(By.name("country")));
s.selectByVisibleText("INDIA");
	
}
}
