package Section1;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
}
}
