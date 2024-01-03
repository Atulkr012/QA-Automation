package Section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethods {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\server\\chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Dimension d = new Dimension(300, 400);
	driver.manage().window().setSize(d);
	Thread.sleep(3000);
	Point p = new Point(400, 300);
	driver.manage().window().setPosition(p);
}
}
