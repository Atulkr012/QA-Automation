package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonElectronics {
public static void main(String[] args) throws Throwable {
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.amazon.in/");
   Thread.sleep(3000);
   driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']")).click();
   List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible']/li"));
   int count =0;
	for(WebElement i:ele)
	{
		count++;
		if (count>=13 && count<=17 )
		{	
	System.out.println(i.getText()+"---- "+count);
		}
	}
	
	
}
}
//write a sc