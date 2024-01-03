package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeHiddenPopup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//td[@class='selection']/div/div")).click();
	    driver.findElement(By.xpath("//div[text()='Delete']")).click();
	    Thread.sleep(3000);
	    String data = driver.findElement(By.xpath("//div[@class='dialogWithPointerWrapper deleteDialog']/div/div/div/div[2]")).getText();
	    System.out.println(data);
	    //Alert alt =driver.switchTo().alert();
	    //Thread.sleep(3000);
	    //alt.dismiss();
	    
	
	
	
	
	
	
	}
	
}
