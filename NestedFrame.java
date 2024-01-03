package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		driver.switchTo().frame(1);
		driver.findElement(By.id("email")).sendKeys("atulkr4444@gmail.com",keys.)
}
}
