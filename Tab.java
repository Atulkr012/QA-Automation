package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Tab {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rapido.bike/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zomato.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Set<String> allid = driver.getWindowHandles();
		
	/*	for (String i : allid) {
			
			driver.switchTo().window(i);
			String title=driver.getTitle();
			//System.out.println(title);
			if(title.contains("Online Shopping site in "));
			{
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.close(); */
	//	Set<String> allID = driver.getWindowHandles();
		for (String i : allID) {
			String title= driver.switchTo().window(i).getTitle();
			if(title.contains("Rapido Bike Taxi"))
			{
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	}
