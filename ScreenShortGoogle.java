package Section2;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShortGoogle {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
   // WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    TakesScreenshot sh =(TakesScreenshot)driver;
    File src =sh.getScreenshotAs(OutputType.FILE);
    File dist = new File("D:\\Selenium\\screenshot\\p2.png");
    Files.copy(src, dist);
    
	}
}

