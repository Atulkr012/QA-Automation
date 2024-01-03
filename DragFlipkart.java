package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragFlipkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	try {
	driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
		System.out.println("handle exception");
		}
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("I phone");
		ele.submit();
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.className("_3FdLqY"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(src, 50, 0).perform();
		Thread.sleep(3000);
		WebElement src1 = driver.findElement(By.xpath("//div[@class='_31Kbhn WC_zGJ']/div"));
		act.dragAndDropBy(src1, -50, 0).perform();
		
}
}
