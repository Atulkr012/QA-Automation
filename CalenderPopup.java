package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/datePick?scenario=1&sublist=0");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("01/01/2024");
}
}
