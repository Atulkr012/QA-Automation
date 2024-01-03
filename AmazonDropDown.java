package Section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropDown {
	
public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().getImplicitWaitTimeout();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']")).click();
	List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible']/li"));
	/*for(WebElement i:ele)
	{
	String data=i.getText();
	System.out.println(data);
	int count=0;
	if(data.contains("shop by departmen"));
    {
	count++;
	break;
	}
    
	}	*/








	




for(WebElement i:ele)
{
for(int j=16;j<=19;j++)
{
	
	String data[]=new String[j];
	System.out.println(data);
	
}
}
}
}

