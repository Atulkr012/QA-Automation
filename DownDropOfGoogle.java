package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownDropOfGoogle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.findElement(By.className("gLFyf")).sendKeys("katrina");
		Thread.sleep(3000);
		List<WebElement> ele=   driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		for(WebElement i:ele)
		{
			String data = i.getText();
			System.out.println(data);
		}
}
}
