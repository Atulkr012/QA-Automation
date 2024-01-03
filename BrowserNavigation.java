package Section1;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapido.bike/");
		Thread.sleep(2000);
		driver.get("https://paytm.com/movies");
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/");
		
		Navigation nav = driver.navigate();
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
	}
}
