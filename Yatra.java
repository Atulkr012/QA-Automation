package RoomPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.yatra.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("BE_flight_origin_city")).click();
	driver.findElement(By.name("flight_origin")).sendKeys("HYD",Keys.ENTER,"IXR",Keys.ENTER);
	//driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("IXR",Keys.ENTER);
	driver.findElement(By.id("BE_flight_origin_date")).click();
	driver.findElement(By.id("10/11/2023")).click();
	driver.findElement(By.id("BE_flight_arrival_date")).click();
	driver.findElement(By.id("22/11/2023")).click();
	driver.findElement(By.cssSelector("[class='icon icon-angle-right arrowpassengerBox']")).click();
	driver.findElement(By.xpath("//span[@id='adultPax']/..//following-sibling::div/div/span[2]")).sendKeys(Keys.ENTER,Keys.ENTER,Keys.ENTER);
}
}
