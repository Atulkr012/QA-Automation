package Section1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeSystemTesting {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		ele.sendKeys("admin");
		WebElement ele1 = driver.findElement(By.name("pwd"));
		ele1.sendKeys("manager");
		WebElement ele2 = driver.findElement(By.id("keepLoggedInCheckBox"));
		ele2.click();
		WebElement ele3 = driver.findElement(By.id("loginButton"));
		ele3.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Atul1");
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("How are you");
		driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
	}
}
