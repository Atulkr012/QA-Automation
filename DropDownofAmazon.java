package Section2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownofAmazon {
	public static void main(String[] args) throws Throwable {
	//	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus mobile");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		for(WebElement i:ele)
		{
		String data=i.getText();
		System.out.println(data);
		}
}
}
