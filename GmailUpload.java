package Section2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailUpload {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://accounts.google.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("identifier")).sendKeys("Nayak790300@gmail.com",Keys.ENTER);
	driver.findElement(By.name("Passwd")).sendKeys("atulkumar123",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.id("gbwa")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[text()='Gmail']")).click();
	driver.switchTo().defaultContent();
	String main =driver.getWindowHandle();
	Set<String> allid =driver.getWindowHandles();
	for(String i:allid) {
			if(!i.equals(main))
			{
				driver.switchTo().window(i);
			}
		}
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	//Thread.sleep(3000);
    WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='New Message']")));
	Thread.sleep(5000);
	//driver.switchTo().frame(4);
	WebElement ele=driver.findElement(By.cssSelector("input[role='combobox']"));
	ele.sendKeys("atulkr4444@gmail.com",Keys.ENTER,Keys.TAB,"Resume",Keys.ENTER);
	//driver.findElement(By.className("subjectbox")).sendKeys("Resume");
	driver.findElement(By.cssSelector("div[class='a1 aaA aMZ']")).click();
	StringSelection copy = new StringSelection("C:\\Users\\Admin\\Downloads\\White and Beige Minimalist Graphic Designer Professional Cv Resume (2)");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
