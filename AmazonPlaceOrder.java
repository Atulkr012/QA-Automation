package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPlaceOrder {
	public static void main(String[] args) throws Throwable {
	//	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("atulkr4444@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Myownway");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Tshirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']")).click();
		Thread.sleep(3000);
		String main= driver.getWindowHandle();
		Set<String> next = driver.getWindowHandles();
		for (String i : next) {
			if(!i.equals(main))
			{
				driver.switchTo().window(i);
			}
		}
		driver.findElement(By.cssSelector("input[title='Buy Now']")).click();
		driver.findElement(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("placeYourOrder1")).click();
	}
}
