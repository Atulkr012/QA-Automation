package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprompt {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
		WebElement ele = driver.findElement(By.id("buttonAlert1"));
		ele.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("yes");
}
}
