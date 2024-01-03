package Section1;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WebApplication {
    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.Amazon.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	}
}
