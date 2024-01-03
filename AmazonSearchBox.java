package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchBox {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus mobile");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();
	    
	}
}
