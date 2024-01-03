package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceDisplay {
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	/*try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	} catch (Exception e) {
		System.out.println("Exception Handled");
	}*/
	driver.findElement(By.name("q")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("I phone");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
	String str=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).getText();
	System.out.println(str);
	String s=driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 14 (Blue, 128 GB)')]/../following-sibling::div/div/div/div")).getText();
	System.out.println(s);
	
	
}
}