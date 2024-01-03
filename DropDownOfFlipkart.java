package Section2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownOfFlipkart {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		driver.findElement(By.name("q")).sendKeys("I phone");
		Thread.sleep(3000);
		List<WebElement> ele= driver.findElements(By.xpath("//li[@class='_3D0G9a']/following-sibling::li"));
	    for (WebElement i:ele)
	    {
	    	String data = i.getText();
	    	System.out.println(data);
	    }
	}
	}
