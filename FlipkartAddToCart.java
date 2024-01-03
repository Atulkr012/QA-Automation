package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		/*try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}*/
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("I phone");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
		String main= driver.getWindowHandle();
		Set<String> next = driver.getWindowHandles();
		for (String i : next) {
			if(!i.equals(main))
			{
				driver.switchTo().window(i);
			}
		}
		driver.findElement(By.xpath("//*[local-name()='svg' and @class='_1KOMV2']")).click();
		//driver.findElement(null)
	}
}
