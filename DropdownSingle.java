package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSingle {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		driver.findElement(By.id("phone")).sendKeys("8235408635");
		WebElement ele= driver.findElement(By.xpath("//label[text()='Gender']/following-sibling::select"));
		ele.click();
		Select s= new Select(ele);
		s.selectByValue("male");
		
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
        ele2.click();
        Select s1= new Select(ele2);
        s1.selectByValue("United Kingdom");
}
}
