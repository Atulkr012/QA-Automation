package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriTest {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//div[text()='Jobs']"));
	WebElement ele =driver.findElement(By.xpath("//div[text()='Jobs']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class='nI-gNb-header1__headerAnchor']/../following-sibling::li"));
	for(WebElement i:ele1)
	{
	String data=i.getText();
	System.out.println(data);
	}
	
}
}
