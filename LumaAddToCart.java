package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LumaAddToCart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Men']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	WebElement ele1 = driver.findElement(By.id("ui-id-17"));
	act.moveToElement(ele1).perform();//ui-id-20
	WebElement ele2 = driver.findElement(By.id("ui-id-20"));
	act.moveToElement(ele2).perform();
	ele2.click();
	driver.findElement(By.className("product-image-photo")).click();
	driver.findElement(By.id("option-label-size-143-item-168")).click();
	driver.findElement(By.id("option-label-color-93-item-53")).click();
	WebElement ele3= driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	ele3.click();
	if (ele3.isDisplayed())
	{
		System.out.println("You added Marco Lightweight Active Hoodie to your shopping cart.");
	}
	else
	{
		System.out.println("Your product  Marco Lightweight Active Hoodie is not added to your shopping cart.");
	}
	
	
	
}
}
