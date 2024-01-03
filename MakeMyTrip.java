package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		Navigation nav= driver.navigate();
		nav.refresh();
		Thread.sleep(3000);
		//driver.switchTo().frame(2);
		//driver.findElement(By.xpath("//a[@class='close']")).click();
	  //  driver.switchTo().defaultContent();	
	   // driver.switchTo().frame(0);
	  //  driver.findElement(By.xpath("//*[local-name()='svg' and @class='LgbsSe-Bz112c']")).click();
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.id("fromCity")).sendKeys("IXR");
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("toCity")).sendKeys("BLR");
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
		driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
		driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
		driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
	//	driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
		driver.findElement(By.cssSelector("div[aria-label='Tue Jan 02 2024']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Tap to add a return date for bigger discounts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[aria-label='Thu Jan 04 2024']")).click();
		driver.findElement(By.xpath("//p[text()='Economy/Premium Economy']")).click();
		driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[3]")).click();
		driver.findElement(By.xpath("//div[@class='makeFlex column childCounter']/p/following-sibling::ul/li[2]")).click();
		driver.findElement(By.xpath("//p[text()='INFANTS (below 2y)']/following-sibling::ul/li[2]")).click();
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		
}
}
