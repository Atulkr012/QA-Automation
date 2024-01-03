package ZSelenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCalender {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String month="April";
	driver.get("https://demoapps.qspiders.com/datePick/datedropdown?scenario=1&sublist=1");
	driver.findElement(By.cssSelector("input[type='text']")).click();
	while ( true)
	{
		String CurMonth = driver.findElement(By.xpath("//div[@class='react-datepicker__header ']/div[1]")).getText();
		if(CurMonth.contains(month)) 
		{
			break;
			
		}
		else
		{
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		}
			
	}
}
}
