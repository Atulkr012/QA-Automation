package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDetails {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele = driver.findElement(By.name("username"));
	ele.sendKeys("Admin");
	WebElement ele1 =driver.findElement(By.name("password"));
	ele1.sendKeys("admin123");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	//driver.findElement(By.className("oxd-icon bi-list oxd-topbar-header-hamburger")).click();
	//driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']/../../following-sibling::li/a/span")).click();
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Nayak");
	driver.findElement(By.xpath("//div[@class='oxd-table-filter']/div[2]/form/div/div/div[2]/div/div[2]/input")).sendKeys("34524");
	driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
	Thread.sleep(3000);
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//div[text()='Current Employees Only']")).click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/../../../../following-sibling::div[4]/div/div[2]/div/div/input")).sendKeys("peter mac anderso");
	Thread.sleep(3000);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']/following-sibling::div[5]/div/div[2]/div/div/div")).click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
    driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']/following-sibling::div[6]/div/div[2]/div/div/div")).click();
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'")).click();
	
	








}
}
