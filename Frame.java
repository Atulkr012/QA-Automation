package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/frames?sublist=0");
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("ssss",Keys.TAB,"1234",Keys.ENTER);
		
}
}
