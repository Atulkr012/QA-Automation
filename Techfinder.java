package RoomPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techfinder {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://techfynder.com/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("interactive-close-button")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	//	driver.findElement(By.className("hire-talent")).click();
	//	Thread.sleep(3000);
	//.findElement(By.xpath("//div[text()=' OUR SERVICE ']/following-sibling::li/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//div[text()=' OUR SERVICE ']/following-sibling::li/a"));
		jse.executeScript("arguments[0].scrollIntoView();" , ele);
}
}
