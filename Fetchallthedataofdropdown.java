package ZSelenium2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fetchallthedataofdropdown {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select s = new Select(ele);
		List<WebElement> mulele= s.getOptions();
		for(WebElement e:mulele)
        {
			System.out.println(e.getText());
			}
}
}
