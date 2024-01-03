package Section1;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\server\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	}
	}
