package ZSelenium2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandle {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rapido.bike/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zomato.com/india");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.bookmyshow.com/");
		
		Set<String> allID = driver.getWindowHandles();
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
