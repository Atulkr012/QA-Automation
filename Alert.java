package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		WebElement ele = driver.findElement(By.id("buttonAlert2"));
		ele.click();
		org.openqa.selenium.Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		ele.click();
		al.getText();
		
		
}
}